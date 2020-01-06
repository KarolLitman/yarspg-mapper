package mapper;// Generated from YARS.g4 by ANTLR 4.7.1
import yarspg.YARSpgBaseListener;
import yarspg.YARSpgParser;

import java.util.HashMap;
import java.util.Map;

public class YARSpgListener extends YARSpgBaseListener {
	public YARS y = new YARS();

	edge edge;
	vertex vertex;
	boolean isVertex;
	Map<String, String> properties;
	public void enterYarspg(YARSpgParser.YarspgContext ctx){

	};
	public void exitYarspg(YARSpgParser.YarspgContext ctx){

	};
	public void enterStatement(YARSpgParser.StatementContext ctx){

	};
	public void exitStatement(YARSpgParser.StatementContext ctx){

	};
	public void enterPrefix_directive(YARSpgParser.Prefix_directiveContext ctx){
	};
	public void exitPrefix_directive(YARSpgParser.Prefix_directiveContext ctx){};
	public void enterPname(YARSpgParser.PnameContext ctx){};
	public void exitPname(YARSpgParser.PnameContext ctx){};
	public void enterPn_local(YARSpgParser.Pn_localContext ctx){};
	public void exitPn_local(YARSpgParser.Pn_localContext ctx){};
	public void enterMetadata(YARSpgParser.MetadataContext ctx){};
	public void exitMetadata(YARSpgParser.MetadataContext ctx){};
	public void enterGraph_name(YARSpgParser.Graph_nameContext ctx){};
	public void exitGraph_name(YARSpgParser.Graph_nameContext ctx){};
	public void enterAnnotation(YARSpgParser.AnnotationContext ctx){};
	public void exitAnnotation(YARSpgParser.AnnotationContext ctx){};
	public void enterString_annotation(YARSpgParser.String_annotationContext ctx){};
	public void exitString_annotation(YARSpgParser.String_annotationContext ctx){};
	public void enterRdf_annotation(YARSpgParser.Rdf_annotationContext ctx){};
	public void exitRdf_annotation(YARSpgParser.Rdf_annotationContext ctx){};
	public void enterAnnotations_list(YARSpgParser.Annotations_listContext ctx){};
	public void exitAnnotations_list(YARSpgParser.Annotations_listContext ctx){};
	public void enterProps_list(YARSpgParser.Props_listContext ctx){};
	public void exitProps_list(YARSpgParser.Props_listContext ctx){};
	public void enterGraphs_list(YARSpgParser.Graphs_listContext ctx){};
	public void exitGraphs_list(YARSpgParser.Graphs_listContext ctx){};
	public void enterNode(YARSpgParser.NodeContext ctx){
		vertex = new vertex();
		properties = new HashMap<String, String>();
	};
	public void exitNode(YARSpgParser.NodeContext ctx){
		vertex.properties=properties;
		y.vertexMap.put(vertex.id,vertex);
	};
	public void enterEdge(YARSpgParser.EdgeContext ctx){
		edge = new edge();
		properties = new HashMap<String, String>();
	};
	public void exitEdge(YARSpgParser.EdgeContext ctx){
	edge.vertex_start = y.vertexMap.get(ctx.getChild(0).getChild(1).getText());
	int second_label=ctx.getChild(0).getChildCount();
    edge.vertex_end = y.vertexMap.get(ctx.getChild(0).getChild(second_label-2).getText());
    edge.properties=properties;
    y.edgeList.add(edge);
	};
	public void enterSection(YARSpgParser.SectionContext ctx){};
	public void exitSection(YARSpgParser.SectionContext ctx){};
	public void enterDirected(YARSpgParser.DirectedContext ctx){};
	public void exitDirected(YARSpgParser.DirectedContext ctx){};
	public void enterUndirected(YARSpgParser.UndirectedContext ctx){};
	public void exitUndirected(YARSpgParser.UndirectedContext ctx){};
	public void enterNode_id(YARSpgParser.Node_idContext ctx){
			vertex.id = ctx.getText();

	};
	public void exitNode_id(YARSpgParser.Node_idContext ctx){};
	public void enterNode_label(YARSpgParser.Node_labelContext ctx){
		vertex.labels.add(ctx.getText());
	};
	public void exitNode_label(YARSpgParser.Node_labelContext ctx){};
	public void enterProp(YARSpgParser.PropContext ctx){
	properties.put(ctx.getChild(0).getText(), ctx.getChild(2).getText());
	};

	public void exitProp(YARSpgParser.PropContext ctx){};
	public void enterEdge_id(YARSpgParser.Edge_idContext ctx){
		edge.id = ctx.getText();
	};

	public void exitEdge_id(YARSpgParser.Edge_idContext ctx){};
	public void enterEdge_label(YARSpgParser.Edge_labelContext ctx){

		edge.labels.add(ctx.getText());

	};
	public void exitEdge_label(YARSpgParser.Edge_labelContext ctx){};
	public void enterKey(YARSpgParser.KeyContext ctx){};
	public void exitKey(YARSpgParser.KeyContext ctx){};
	public void enterValue(YARSpgParser.ValueContext ctx){};
	public void exitValue(YARSpgParser.ValueContext ctx){};
	public void enterPrimitive_value(YARSpgParser.Primitive_valueContext ctx){};
	public void exitPrimitive_value(YARSpgParser.Primitive_valueContext ctx){};
	public void enterComplex_value(YARSpgParser.Complex_valueContext ctx){};
	public void exitComplex_value(YARSpgParser.Complex_valueContext ctx){};
	public void enterSet(YARSpgParser.SetContext ctx){};
	public void exitSet(YARSpgParser.SetContext ctx){};
	public void enterList(YARSpgParser.ListContext ctx){};
	public void exitList(YARSpgParser.ListContext ctx){};
	public void enterStruct(YARSpgParser.StructContext ctx){};
	public void exitStruct(YARSpgParser.StructContext ctx){};






	public void enterNode_schema(YARSpgParser.Node_schemaContext ctx){};
	public void exitNode_schema(YARSpgParser.Node_schemaContext ctx){};
	public void enterProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx){};
	public void exitProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx){};
	public void enterProp_schema(YARSpgParser.Prop_schemaContext ctx){};
	public void exitProp_schema(YARSpgParser.Prop_schemaContext ctx){};
	public void enterValue_schema(YARSpgParser.Value_schemaContext ctx){};
	public void exitValue_schema(YARSpgParser.Value_schemaContext ctx){};
	public void enterPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx){};
	public void exitPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx){};
	public void enterComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx){};
	public void exitComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx){};
	public void enterSet_schema(YARSpgParser.Set_schemaContext ctx){};
	public void exitSet_schema(YARSpgParser.Set_schemaContext ctx){};
	public void enterList_schema(YARSpgParser.List_schemaContext ctx){};
	public void exitList_schema(YARSpgParser.List_schemaContext ctx){};
	public void enterStruct_schema(YARSpgParser.Struct_schemaContext ctx){};
	public void exitStruct_schema(YARSpgParser.Struct_schemaContext ctx){};
	public void enterEdge_schema(YARSpgParser.Edge_schemaContext ctx){};
	public void exitEdge_schema(YARSpgParser.Edge_schemaContext ctx){};
	public void enterDirected_schema(YARSpgParser.Directed_schemaContext ctx){};
	public void exitDirected_schema(YARSpgParser.Directed_schemaContext ctx){};
	public void enterUndirected_schema(YARSpgParser.Undirected_schemaContext ctx){};
	public void exitUndirected_schema(YARSpgParser.Undirected_schemaContext ctx){};
}