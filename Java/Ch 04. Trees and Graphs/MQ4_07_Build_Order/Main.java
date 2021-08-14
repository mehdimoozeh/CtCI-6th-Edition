package MQ4_07_Build_Order;

import Introduction.MyQueue;
import helper.Graph;
import helper.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Character[] order = new Character[128];
    private static MyQueue q = new MyQueue();

    public static void main(String args[]) {

        Graph<Character> dependencies = new Graph<>();
        Vertex e = dependencies.addNewVertex('e');
        Vertex f = dependencies.addNewVertex('f');
        Vertex b = dependencies.addNewVertex('b');
        b.addEdge(f);

        Vertex c = dependencies.addNewVertex('c');

        Vertex a = dependencies.addNewVertex('a');
        a.addEdge(f);


        Vertex d = dependencies.addNewVertex('d');
        d.addEdge(a);
        d.addEdge(b);
        d.addEdge(c);

//        dependencies.printGraph();
        List<Vertex> projects = new ArrayList<>();
        projects.add(a);
        projects.add(b);
        projects.add(c);
        projects.add(d);
        projects.add(e);
        projects.add(f);

        buildOrder(projects);
    }

    private static void buildOrder(List<Vertex> projects) {
        for (Vertex project : projects) {
            depthTraverse(project);
        }

        while (!q.isEmpty()) {
             System.out.println(q.remove());
        }
    }

    private static void depthTraverse(Vertex x) {
        if (order[(Character) x.data] != null) return;

        System.out.print('*');
        ArrayList<Vertex> edges = x.getEdges();
        for (Vertex edge : edges) {
            depthTraverse(edge);
        }

        order[(Character) x.data] = (Character) x.data;
        q.add((Character) x.data);
    }

}
