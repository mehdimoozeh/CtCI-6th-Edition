package helper;


import java.util.*;

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

    public boolean findPath(Vertex sourceVertex, Vertex destinationVertex) { // Depth First Search
        HashMap<Vertex, Boolean> isVisited = new HashMap<Vertex, Boolean>();
        LinkedList<Vertex> path = new LinkedList<>();
        path.add(sourceVertex);
        while(!path.isEmpty()) {
            Vertex currentVertex = path.removeFirst();
            isVisited.put(currentVertex, true);
            if (currentVertex == destinationVertex) {
                System.out.println("true");
                return true;
            } else {
                ArrayList<Vertex> edges = currentVertex.getEdges();
                for (Vertex edge : edges) {
                    if (isVisited.containsKey(edge)) {
                        continue;
                    }
                    path.add(edge);
                }
            }
        }
        System.out.println("false");
        return false;
    }
}


