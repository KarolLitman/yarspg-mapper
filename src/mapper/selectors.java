package mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class selectors {
    YARS y;

    public selectors(YARS y) {
        this.y = y;
    }

    vertex getVertexbyIDSelector(String id){
       return y.vertexMap.get(id);
    }
    edge getEdgebyIDSelector(String id){
        for (edge e: y.edgeList) {
            if(e.id.equals(id)){
        return e;
            }
        }
        return null;
    }
    Object getAllIDSelector(String id){
        if(getVertexbyIDSelector(id)!=null){
            return getVertexbyIDSelector(id);
        }
        else{
            return getEdgebyIDSelector(id);
        }
    }
    List<vertex> getVertexbyLabelSelector(String label){
        List<vertex> vertexList = new ArrayList<>();


        for(Map.Entry<String, vertex> entry : y.vertexMap.entrySet()) {
            //String key = entry.getKey();
            vertex v = entry.getValue();

            for(String s:v.labels){
                if(s.equals(label)){
                   vertexList.add(v);
                }
            }
            // do what you have to do here
            // In your case, another loop.
        }


return vertexList;
    }
    List<edge> getEdgebyLabelSelector(String label){
        List<edge> edgeList = new ArrayList<>();


        for (edge e: y.edgeList) {
            //String key = entry.getKey();

            for(String s:e.labels){
                if(s.equals(label)){
                    edgeList.add(e);
                }
            }
            // do what you have to do here
            // In your case, another loop.
        }


        return edgeList;
    }
    List<Object> getAllbyLabelSelector(String label){
        List<Object> ObjectList = new ArrayList<>();

        ObjectList.addAll(getVertexbyLabelSelector(label));
        ObjectList.addAll(getEdgebyLabelSelector(label));
        return ObjectList;
    }
    List<vertex> getVertexbyPropSelector(String prop){
        List<vertex> vertexList = new ArrayList<>();


        for(Map.Entry<String, vertex> entry : y.vertexMap.entrySet()) {
            vertex v = entry.getValue();

            for(Map.Entry<String, String> entry2 : v.properties.entrySet()) {
                String prop_key = entry2.getKey();

                if (prop_key.equals(prop)) {
                    vertexList.add(v);

                }
            }

        }


        return vertexList;
    }
    List<edge> getEdgebyPropSelector(String prop){
        List<edge> edgeList = new ArrayList<>();


        for (edge e: y.edgeList) {
            //String key = entry.getKey();

            for(Map.Entry<String, String> entry2 : e.properties.entrySet()) {
                //String key = entry2.getKey();
                String prop_key = entry2.getKey();

                if (prop_key.equals(prop)) {
                    edgeList.add(e);

                }
            }
            // do what you have to do here
            // In your case, another loop.
        }


        return edgeList;
    }
    List<Object> getAllbyPropSelector(String prop){
        List<Object> ObjectList = new ArrayList<>();

        ObjectList.addAll(getVertexbyPropSelector(prop));
        ObjectList.addAll(getEdgebyPropSelector(prop));
        return ObjectList;
    }
    void whichSelector(String selector, String value){
        switch(selector){
            case "pr:idSelector":
                System.out.print(getAllIDSelector("\""+value+"\""));
                break;
            case "pr:idNodeSelector":
                System.out.print(getVertexbyIDSelector("\""+value+"\""));
                break;
            case "pr:idEdgeSelector":
                System.out.print(getEdgebyIDSelector("\""+value+"\""));
                break;


            case "pr:labelSelektor":
                System.out.print(getAllbyLabelSelector("\""+value+"\""));
                break;
            case "pr:labelNodeSelector":
                System.out.print(getVertexbyLabelSelector("\""+value+"\""));
                break;
            case "pr:labelEdgeSelector":
                System.out.print(getEdgebyLabelSelector("\""+value+"\""));
                break;

            case "pr:propSelektor":
                System.out.print(getAllbyPropSelector("\""+value+"\""));
                break;
            case "pr:propNodeSelector":
                System.out.print(getVertexbyPropSelector("\""+value+"\""));
                break;
            case "pr:propEdgeSelector":
                System.out.print(getEdgebyPropSelector("\""+value+"\""));
                break;
        }
    }


}
