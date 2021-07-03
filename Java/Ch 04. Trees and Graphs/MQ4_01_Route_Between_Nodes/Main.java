package MQ4_01_Route_Between_Nodes;
import helper.Graph;
import helper.Vertex;

public class Main {
    public static void main(String args[]) {
        Graph graph = new Graph<Integer>();
        Vertex v1 = graph.addNewVertex(1);
        Vertex v2 = graph.addNewVertex(2);
        Vertex v3 = graph.addNewVertex(3);
        Vertex v4 = graph.addNewVertex(4);
        Vertex v5 = graph.addNewVertex(5);
        Vertex v6 = graph.addNewVertex(6);

/*        v1.addEdge(v2);
        v2.addEdge(v5);
        v3.addEdge(v1);
        v3.addEdge(v4);
        v4.addEdge(v5);
        v6.addEdge(v2);
        v6.addEdge(v3);*/

        v1.addEdge(v2);
        v2.addEdge(v3);
        v3.addEdge(v1);

        graph.printGraph();

        graph.findPath(v1, v4);
    }
}
