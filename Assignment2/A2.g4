grammar A2;

@header {
import java.util.TreeMap;
}

@members {
	
}

start
	: {System.out.println("public class A2 {\n\tpublic static void main(String[] args){");}( stmtlist {System.out.println($stmtlist.s+"\n");})+ EOF {System.out.println("\n\t}\n}");} EOF
	;

stmtlist returns [String s]
 : check=stmtlist stmt { $s = $check.s + $stmt.st; }
 | stmt { $s = $stmt.st;}
 ;

stmt returns [String st]
 : vdeclare { $st = $vdeclare.s; }
 | vassign { $st = $vassign.s; }
 | wloop { $st = $wloop.sw; }
 ;

wloop returns [String sw]
 : 'while' condition 'do' stmtlist 'end while'
 	{
 		$sw = "\n\t\twhile "+ $condition.sp +" \n\t\t{\n"+ $stmtlist.s+"\t\t};";
 	}
 ;

vdeclare returns [String s]
 : 'declare' ID ': Integer'
 	{
 		$s = "\t\tint "+$ID.getText()+";\n";
 	}
 ;

vassign returns [String s]
 : ID ':=' expr
 	{
 		$s = "\t\t"+$ID.getText()+" = "+$expr.s+";\n"; 
 	}
 ;

expr returns [String s]
 : e1=expr '+' term { $s = $e1.s+" + "+$term.s; }
 | e2=expr '-' term { $s = $e2.s+" - "+$term.s; }
 | term { $s = $term.s; }
 ;

term returns [String s]
 : t1=term '*' factor { $s = $t1.s+" * "+$factor.number; }
 | t2=term '/' factor { $s = $t2.s+" / "+$factor.number; }
 | factor { $s = $factor.number; }
 ;

factor returns [String number]
 : '('expr')' { $number = "( "+$expr.s+" )"; }
 | NUM { $number = ""+ $NUM.getText(); }
 | ID { $number = $ID.getText(); }
 ;

condition returns [String sp]
 : c1=condition 'and' decision { $sp = $c1.sp+" && "+$decision.number; }
 | decision { $sp = $decision.number; }
 ;

decision returns [String number]
 : ID '>' NUM { $number = $ID.getText()+" > "+$NUM.getText(); }
 | ID '<' NUM { $number = $ID.getText()+" < "+$NUM.getText(); }
 | NUM '>' ID { $number = $NUM.getText()+ " > "+$ID.getText(); }
 | NUM '<' ID { $number = $NUM.getText()+ " < "+$ID.getText(); }
 | '('condition')' { $number ="( "+ $condition.sp +" )"; }
 ;

NUM
 : [0-9]+
 ;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

WS
 : (' ' | '\n' | '\t' | '\r')+ {skip();};

