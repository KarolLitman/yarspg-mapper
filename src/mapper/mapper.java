package mapper;

import turtle.TURTLELexer;
import turtle.TURTLEParser;
import yarspg.YARSpgLexer;
import yarspg.YARSpgParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Map;


public class mapper {

    public static void main(String[] args) throws Exception {


//        YARSVisitor yars = new YARSVisitor();
//        System.out.println(yars.visit(tree));
//        yars.y.buildTurtle();



        String input="# Nodes\n" +
                "<\"Author01\">{\"Author\"}[\"fname\": \"John\", \"lname\": \"Smith\",\"age\":30]\n" +
                "<\"Author02\">{\"Author\"}[\"fname\": \"Alice\", \"lname\": \"Brown\"]\n" +
                "\n" +
                "# Edge\n" +
                "(\"Author01\")-<\"edge01\">{\"knows\"}[\"since\": 2000]-(\"Author02\")";

//        String input="<\"Author01\">{\"Author\"}[\"fname\": \"John\", \"lname\": \"Smith\"] #Author01\n" +
//                "<\"Author02\">{\"Author\"}[\"fname\": \"Alice\", \"lname\": \"Brown\"]\n" +
//                "<\"EI01\">{\"Entry\", \"InProceedings\"}[\"title\": \"Serialization for...\", \"numpages\": 10, \"keyword\": \"Graph database\"]\n" +
//                "<\"EA01\">{\"Entry\", \"Article\"}[\"title\": \"Property Graph...\",  \"numpages\": 10, \"keyword\": [\"Query\", \"Graph\"]]\n" +
//                "<\"Proc01\">{\"Proceedings\"}[\"title\": \"BDAS\", \"year\": 2018, \"month\": \"May\"]\n" +
//                "<\"Jour01\">{\"Journal\"}[\"title\": \"J. DB\", \"year\": 2020, \"vol\": 30]\n" +
//                "\n" +
//                "# Edge\n" +
//                "(\"EI01\")-<\"Edge01\">{\"has_author\"}[\"order\": 1]->(\"Author01\")\n" +
//                "(\"EI01\")-{\"has_author\"}[\"order\": 2]->(\"Author02\")\n" +
//                "(\"EA01\")-{\"has_author\"}[\"order\": 1]->(\"Author02\")\n" +
//                "(\"EA01\")-{\"cites\"}->(\"EI01\")\n" +
//                "(\"EI01\")-{\"booktitle\"}[\"pages\": \"111-121\"]->(\"Proc01\")\n" +
//                "(\"EA01\")-{\"published_in\"}[\"pages\": \"222-232\"]->(\"Jour01\")";

        String input2="<#PersonMapping>\n" +
                "rml:logicalSource [\n" +
                "rml:source \"People.yars\";\n" +
                "rml:referenceFormulation pr:PG2RMLSelector;\n" +
                "pr:selector [ pr:idEdgeSelector \"edge01\" ] \n" +
                "].";

       // CharStream input = CharStreams.fromFileName(test);




        YARSpgLexer lexer = new YARSpgLexer(CharStreams.fromString(input));
        YARSpgParser parser = new YARSpgParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.yarspg();
        YARSpgListener yars2 = new YARSpgListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(yars2, tree);

        selectors s=new selectors(yars2.y);

        TURTLELexer lexer2 = new TURTLELexer(CharStreams.fromString(input2));
        TURTLEParser parser2 = new TURTLEParser(new CommonTokenStream(lexer2));
        ParseTree tree2 = parser2.turtleDoc();
        TURTLEListener turtle = new TURTLEListener();
        ParseTreeWalker walker2 = new ParseTreeWalker();
        walker2.walk(turtle, tree2);


        if(turtle.key_value.get("rml:referenceFormulation").equals("pr:PG2RMLSelector")){
            String typeAndValue = turtle.key_value.get("pr:selector");
            typeAndValue=typeAndValue.substring(1,typeAndValue.length()-1);
            String parts[] = typeAndValue.split("\"", 2);
            parts[1]=parts[1].substring(0,parts[1].length()-1);
            System.out.println(turtle.key_value.get("rml:source")+" "+ parts[0]+" "+parts[1]);
            s.whichSelector(parts[0],parts[1]);
        }


   //    System.out.print(s.getVertexbyIDSelector("\"Author01\""));
        //System.out.print(s.getEdgebyIDSelector("\"Edge01\""));
        //System.out.print(s.getAllIDSelector("\"Edge01\""));
        //System.out.print(s.getVertexbyLabelSelector("\"Author\""));
        //System.out.print(s.getEdgebyLabelSelector("\"has_author\""));
       // System.out.print(s.getAllbyLabelSelector("\"has_author\""));
       //  System.out.print(s.getVertexbyPropSelector("\"fname\""));
       // System.out.print(s.getEdgebyPropSelector("\"order\""));
      //  System.out.print(s.getAllbyPropSelector("\"pages\""));




    }








    }


