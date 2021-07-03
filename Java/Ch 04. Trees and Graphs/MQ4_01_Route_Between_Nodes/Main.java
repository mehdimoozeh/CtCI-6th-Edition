package MQ4_01_Route_Between_Nodes;
import helper.Graph;
import helper.Vertex;

public class Main {
    public static void main(String args[]) {
/*        Node<Integer> leftNode = new Node<Integer>(2);
        Node<Integer> rightNode = new Node<Integer>(3);
        Node<Integer> rootNode = new Node<Integer>(1);
        rootNode.setLeftChild(leftNode);
        rootNode.setRightChild(rightNode);


        rootNode.preOrderTraversal(rootNode);
        System.out.println();
        rootNode.inOrderTraversal(rootNode);
        System.out.println();
        rootNode.postOrderTraversal(rootNode);*/

        Graph graph = new Graph<Integer>();
        Vertex v1 = graph.addNewVertex(1);
        Vertex v2 = graph.addNewVertex(2);
        Vertex v3 = graph.addNewVertex(3);
        Vertex v4 = graph.addNewVertex(4);

        v1.addEdge(v2);
        v1.addEdge(v4);
        v3.addEdge(v1);
        v4.addEdge(v3);

        graph.printGraph();
    }
}
