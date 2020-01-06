package mapper;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import turtle.TURTLEParser;
import yarspg.YARSpgBaseListener;
import turtle.TURTLEBaseListener;

import java.util.HashMap;
import java.util.Map;

public class TURTLEListener  extends TURTLEBaseListener {

    String verb;
    Map<String, String> key_value = new HashMap<String, String>();;



    @Override public void enterTurtleDoc(TURTLEParser.TurtleDocContext ctx) {

    }
    @Override public void exitTurtleDoc(TURTLEParser.TurtleDocContext ctx) { }
    @Override public void enterStatement(TURTLEParser.StatementContext ctx) { }
    @Override public void exitStatement(TURTLEParser.StatementContext ctx) { }
    @Override public void enterDirective(TURTLEParser.DirectiveContext ctx) { }
    @Override public void exitDirective(TURTLEParser.DirectiveContext ctx) { }
    @Override public void enterPrefixID(TURTLEParser.PrefixIDContext ctx) { }
    @Override public void exitPrefixID(TURTLEParser.PrefixIDContext ctx) { }
    @Override public void enterBase(TURTLEParser.BaseContext ctx) { }
    @Override public void exitBase(TURTLEParser.BaseContext ctx) { }
    @Override public void enterSparqlBase(TURTLEParser.SparqlBaseContext ctx) { }
    @Override public void exitSparqlBase(TURTLEParser.SparqlBaseContext ctx) { }
    @Override public void enterSparqlPrefix(TURTLEParser.SparqlPrefixContext ctx) { }
    @Override public void exitSparqlPrefix(TURTLEParser.SparqlPrefixContext ctx) { }
    @Override public void enterTriples(TURTLEParser.TriplesContext ctx) { }
    @Override public void exitTriples(TURTLEParser.TriplesContext ctx) { }
    @Override public void enterPredicateObjectList(TURTLEParser.PredicateObjectListContext ctx) { }
    @Override public void exitPredicateObjectList(TURTLEParser.PredicateObjectListContext ctx) { }
    @Override public void enterObjectList(TURTLEParser.ObjectListContext ctx) {
        key_value.put(verb,ctx.getText());
    }
    @Override public void exitObjectList(TURTLEParser.ObjectListContext ctx) { }
    @Override public void enterVerb(TURTLEParser.VerbContext ctx) {

        verb=ctx.getText();
    }
    @Override public void exitVerb(TURTLEParser.VerbContext ctx) { }
    @Override public void enterSubject(TURTLEParser.SubjectContext ctx) { }
    @Override public void exitSubject(TURTLEParser.SubjectContext ctx) { }
    @Override public void enterPredicate(TURTLEParser.PredicateContext ctx) { }
    @Override public void exitPredicate(TURTLEParser.PredicateContext ctx) { }
    @Override public void enterObject(TURTLEParser.ObjectContext ctx) { }
    @Override public void exitObject(TURTLEParser.ObjectContext ctx) { }
    @Override public void enterLiteral(TURTLEParser.LiteralContext ctx) { }
    @Override public void exitLiteral(TURTLEParser.LiteralContext ctx) { }
    @Override public void enterBlankNodePropertyList(TURTLEParser.BlankNodePropertyListContext ctx) { }
    @Override public void exitBlankNodePropertyList(TURTLEParser.BlankNodePropertyListContext ctx) { }
    @Override public void enterCollection(TURTLEParser.CollectionContext ctx) { }
    @Override public void exitCollection(TURTLEParser.CollectionContext ctx) { }
    @Override public void enterRdfLiteral(TURTLEParser.RdfLiteralContext ctx) { }
    @Override public void exitRdfLiteral(TURTLEParser.RdfLiteralContext ctx) { }
    @Override public void enterIri(TURTLEParser.IriContext ctx) { }
    @Override public void exitIri(TURTLEParser.IriContext ctx) { }
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    @Override public void visitTerminal(TerminalNode node) { }
    @Override public void visitErrorNode(ErrorNode node) { }
}
