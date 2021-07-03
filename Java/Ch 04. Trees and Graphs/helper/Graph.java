package helper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Graph<T> {
    public HashMap<T, Vertex> vertices = new HashMap<T, Vertex>();

    public Vertex<T> addNewVertex(T data) {
        Vertex<T> v = new Vertex<T>(data);
        vertices.put(data, v);
        return v;
    }

    public void printGraph() {
        Iterator i = vertices.entrySet().iterator();
        while(i.hasNext()) {
            Map.Entry element = (Map.Entry)i.next();
            vertices.get(element.getKey()).printEdges();
        }
    }
}


