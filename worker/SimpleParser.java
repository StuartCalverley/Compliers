// Generated from Simple.g4 by ANTLR 4.5.2

    import java.util.*;
    import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NUM=10, ID=11, OP=12, WS=13;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_stmt = 2, RULE_assignmentStmt = 3, 
		RULE_printStmt = 4, RULE_exprList = 5, RULE_whileStmt = 6, RULE_expr = 7;
	public static final String[] ruleNames = {
		"start", "program", "stmt", "assignmentStmt", "printStmt", "exprList", 
		"whileStmt", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'let'", "'='", "'print'", "'('", "')'", "','", "'repeat'", "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NUM", "ID", 
		"OP", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SymbolTable sym = new SymbolTable();
	    int counter = 0;

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimpleParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((StartContext)_localctx).program = program();

					Instruction.startingOff();
			                System.out.println(((StartContext)_localctx).program.code);
					Instruction.enddingOff();
			                
			setState(18);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Code code;
		public StmtContext stmt;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		 ((ProgramContext)_localctx).code =  Code.empty(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				((ProgramContext)_localctx).stmt = stmt();

				             _localctx.code.addAll(((ProgramContext)_localctx).stmt.code);
				           
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Code code;
		public AssignmentStmtContext assignmentStmt;
		public PrintStmtContext printStmt;
		public WhileStmtContext whileStmt;
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(36);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				((StmtContext)_localctx).assignmentStmt = assignmentStmt();
				((StmtContext)_localctx).code =  ((StmtContext)_localctx).assignmentStmt.code;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				((StmtContext)_localctx).printStmt = printStmt();
				((StmtContext)_localctx).code =  ((StmtContext)_localctx).printStmt.code;
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				((StmtContext)_localctx).whileStmt = whileStmt();
				((StmtContext)_localctx).code =  ((StmtContext)_localctx).whileStmt.code;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStmtContext extends ParserRuleContext {
		public Code code;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentStmt);
		((AssignmentStmtContext)_localctx).code =  Code.empty();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			((AssignmentStmtContext)_localctx).ID = match(ID);
			setState(40);
			match(T__1);
			setState(41);
			((AssignmentStmtContext)_localctx).expr = expr(0);

				counter++;
			        int register = this.sym.resolve((((AssignmentStmtContext)_localctx).ID!=null?((AssignmentStmtContext)_localctx).ID.getText():null));
			        _localctx.code.addAll(((AssignmentStmtContext)_localctx).expr.code);
			        _localctx.code.add(Instruction.ISTORE(register));
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public Code code;
		public ExprListContext exprList;
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStmt);
		 ((PrintStmtContext)_localctx).code =  Code.empty(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
			match(T__3);
			setState(46);
			((PrintStmtContext)_localctx).exprList = exprList();
			setState(47);
			match(T__4);

			      ((PrintStmtContext)_localctx).code =  new Code();
			      _localctx.code.addAll(((PrintStmtContext)_localctx).exprList.code);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public Code code;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprList);
		 ((ExprListContext)_localctx).code =  Code.empty(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					((ExprListContext)_localctx).e1 = expr(0);
					setState(51);
					match(T__5);
					_localctx.code.add(
					      Instruction.getPrintStream());
					      _localctx.code.addAll(((ExprListContext)_localctx).e1.code);
					      _localctx.code.add(Instruction.invokePrint());
					      _localctx.code.add(Instruction.getPrintStream());
					      _localctx.code.add(Instruction.LDC("\" \""));
					      _localctx.code.add(Instruction.invokePrintString());
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(59);
			((ExprListContext)_localctx).e2 = expr(0);

			      _localctx.code.add(Instruction.getPrintStream());
			      _localctx.code.addAll(((ExprListContext)_localctx).e2.code);
			      _localctx.code.add(Instruction.invokePrintln());
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public Code code;
		public ExprContext e1;
		public ExprContext expr;
		public ProgramContext p1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStmt);
		 ((WhileStmtContext)_localctx).code =  Code.empty(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__6);
			counter++;
			setState(64);
			((WhileStmtContext)_localctx).e1 = ((WhileStmtContext)_localctx).expr = expr(0);
			setState(65);
			match(T__7);
			setState(66);
			((WhileStmtContext)_localctx).p1 = program();
			setState(67);
			match(T__8);

			        ((WhileStmtContext)_localctx).code =  Code.empty();
			        String start = Code.newLabel();
			        String end   = Code.newLabel();
				counter++;
			        int register = this.sym.resolve(Integer.toString(counter));
			        _localctx.code.addAll(((WhileStmtContext)_localctx).expr.code);
			        _localctx.code.add(Instruction.ISTORE(this.sym.get(Integer.toString(counter))));
			        _localctx.code.add(Instruction.Label(start));
			        _localctx.code.add(Instruction.ILOAD(register));
			        _localctx.code.add(Instruction.IFZERO(end));
			        _localctx.code.add(Instruction.ILOAD(register));
			        _localctx.code.add(Instruction.LDC("1"));
			        _localctx.code.add(Instruction.Op("-"));
			        _localctx.code.add(Instruction.ISTORE(this.sym.get(Integer.toString(counter))));
			        _localctx.code.addAll(((WhileStmtContext)_localctx).p1.code);
			        _localctx.code.add(Instruction.GOTO(start));
			        _localctx.code.add(Instruction.Label(end));
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Code code;
		public ExprContext e1;
		public Token ID;
		public Token NUM;
		public Token OP;
		public ExprContext e2;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP() { return getToken(SimpleParser.OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		 ((ExprContext)_localctx).code =  Code.empty(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(71);
				((ExprContext)_localctx).ID = match(ID);
				 if(this.sym.containsKey((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))) {
				                            _localctx.code.add(Instruction.ILOAD(this.sym.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))));
				                          } else {

				                            _localctx.code.add(Instruction.LDC(0));
				                          }
				                            
				                        
				}
				break;
			case NUM:
				{
				setState(73);
				((ExprContext)_localctx).NUM = match(NUM);
				 _localctx.code.add(Instruction.LDC((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null))); 
				                          
				}
				break;
			case T__3:
				{
				setState(75);
				match(T__3);
				setState(76);
				((ExprContext)_localctx).e1 = expr(0);
				setState(77);
				match(T__4);
				 _localctx.code.addAll(((ExprContext)_localctx).e1.code); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					((ExprContext)_localctx).OP = match(OP);
					setState(84);
					((ExprContext)_localctx).e2 = expr(2);
					 
					                                      ((ExprContext)_localctx).code =  new Code();
					                                      _localctx.code.addAll(((ExprContext)_localctx).e1.code);
					                                      _localctx.code.addAll(((ExprContext)_localctx).e2.code);
					                                      _localctx.code.add(Instruction.Op((((ExprContext)_localctx).OP!=null?((ExprContext)_localctx).OP.getText():null)));
					                                  
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\'\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\7\79\n\7\f\7\16\7<\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tS\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\tZ\n\t\f\t\16\t]\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20\2\2]\2\22\3\2"+
		"\2\2\4\31\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n.\3\2\2\2\f:\3\2\2\2\16@\3\2"+
		"\2\2\20R\3\2\2\2\22\23\5\4\3\2\23\24\b\2\1\2\24\25\7\2\2\3\25\3\3\2\2"+
		"\2\26\27\5\6\4\2\27\30\b\3\1\2\30\32\3\2\2\2\31\26\3\2\2\2\32\33\3\2\2"+
		"\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\36\5\b\5\2\36\37\b\4\1"+
		"\2\37\'\3\2\2\2 !\5\n\6\2!\"\b\4\1\2\"\'\3\2\2\2#$\5\16\b\2$%\b\4\1\2"+
		"%\'\3\2\2\2&\35\3\2\2\2& \3\2\2\2&#\3\2\2\2\'\7\3\2\2\2()\7\3\2\2)*\7"+
		"\r\2\2*+\7\4\2\2+,\5\20\t\2,-\b\5\1\2-\t\3\2\2\2./\7\5\2\2/\60\7\6\2\2"+
		"\60\61\5\f\7\2\61\62\7\7\2\2\62\63\b\6\1\2\63\13\3\2\2\2\64\65\5\20\t"+
		"\2\65\66\7\b\2\2\66\67\b\7\1\2\679\3\2\2\28\64\3\2\2\29<\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\20\t\2>?\b\7\1\2?\r\3\2\2\2@A\7"+
		"\t\2\2AB\b\b\1\2BC\5\20\t\2CD\7\n\2\2DE\5\4\3\2EF\7\13\2\2FG\b\b\1\2G"+
		"\17\3\2\2\2HI\b\t\1\2IJ\7\r\2\2JS\b\t\1\2KL\7\f\2\2LS\b\t\1\2MN\7\6\2"+
		"\2NO\5\20\t\2OP\7\7\2\2PQ\b\t\1\2QS\3\2\2\2RH\3\2\2\2RK\3\2\2\2RM\3\2"+
		"\2\2S[\3\2\2\2TU\f\3\2\2UV\7\16\2\2VW\5\20\t\4WX\b\t\1\2XZ\3\2\2\2YT\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2\7\33&:R[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}