grammar Simple;

@header{
    import java.util.*;
    import org.antlr.v4.runtime.*;
}

@members{
    SymbolTable sym = new SymbolTable();
    int counter = 0;
}

start : program {
		Instruction.startingOff();
                System.out.println($program.code);
		Instruction.enddingOff();
                }EOF;

program returns [Code code]
    @init { $code = Code.empty(); }
    : (stmt {
             $code.addAll($stmt.code);
           }) +
    ;

stmt returns [Code code]
    : assignmentStmt {$code = $assignmentStmt.code;}
    | printStmt      {$code = $printStmt.code;}
    | whileStmt      {$code = $whileStmt.code;}
    ;

assignmentStmt returns [Code code]
    @init {$code = Code.empty();}
    : 'let' ID '=' expr
      {
	counter++;
        int register = this.sym.resolve($ID.text);
        $code.addAll($expr.code);
        $code.add(Instruction.ISTORE(register));
      }
    ;

printStmt returns [Code code]
    @init { $code = Code.empty(); }
    : 'print' '(' exprList ')'
      {
      $code = new Code();
      $code.addAll($exprList.code);
      }
    ;

exprList returns [Code code]
  @init { $code = Code.empty(); }
  : (e1=expr ','{$code.add(
      Instruction.getPrintStream());
      $code.addAll($e1.code);
      $code.add(Instruction.invokePrint());
      $code.add(Instruction.getPrintStream());
      $code.add(Instruction.LDC("\" \""));
      $code.add(Instruction.invokePrintString());})* 
	e2=expr {
      $code.add(Instruction.getPrintStream());
      $code.addAll($e2.code);
      $code.add(Instruction.invokePrintln());
  }
  ;

whileStmt returns [Code code]
    @init { $code = Code.empty(); }
    : 'repeat' {counter++;} e1=expr '{' p1=program '}'
      {
        $code = Code.empty();
        String start = Code.newLabel();
        String end   = Code.newLabel();
	counter++;
        int register = this.sym.resolve(Integer.toString(counter));
        $code.addAll($expr.code);
        $code.add(Instruction.ISTORE(this.sym.get(Integer.toString(counter))));
        $code.add(Instruction.Label(start));
        $code.add(Instruction.ILOAD(register));
        $code.add(Instruction.IFZERO(end));
        $code.add(Instruction.ILOAD(register));
        $code.add(Instruction.LDC("1"));
        $code.add(Instruction.Op("-"));
        $code.add(Instruction.ISTORE(this.sym.get(Integer.toString(counter))));
        $code.addAll($p1.code);
        $code.add(Instruction.GOTO(start));
        $code.add(Instruction.Label(end));
      }
    ;

expr returns [Code code]
    @init { $code = Code.empty(); }
    
     : ID               { if(this.sym.containsKey($ID.text)) {
                            $code.add(Instruction.ILOAD(this.sym.get($ID.text)));
                          } else {

                            $code.add(Instruction.LDC(0));
                          }
                            
                        }
     | NUM              { $code.add(Instruction.LDC($NUM.text)); 
                          }
     | '(' e1=expr ')'     { $code.addAll($e1.code); }
     | e1=expr OP e2=expr
                        { 
                            $code = new Code();
                            $code.addAll($e1.code);
                            $code.addAll($e2.code);
                            $code.add(Instruction.Op($OP.text));
                        }
     ;

NUM : [0-9]+;
ID : [a-z]+;
OP : '+' | '-' | '*' | '/' ;
WS : [ \t\r\n]+ {skip();};
