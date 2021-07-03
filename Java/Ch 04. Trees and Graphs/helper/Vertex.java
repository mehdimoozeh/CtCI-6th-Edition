package helper;

import java.util.ArrayList;

public class Vertex<T> {
    public T data;
    private ArrayList<Vertex> edges = new ArrayList<Vertex>();

    public Vertex(T data) {
        this.data = data;
    }

    public void addEdge(Vertex v) {
        this.edges.add(v);
    }

    public void printEdges() {
        for (Vertex neighbour : edges) {
            System.out.println(this.data + " => " + neighbour.data);
        }
    }

    public ArrayList<Vertex> getEdges() {
        return edges;
    }
}