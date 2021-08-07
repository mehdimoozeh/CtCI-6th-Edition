package MQ4_03_List_of_Depths;

import helper.ENode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String args[]) {
        ENode<Integer> root = new ENode(1);
        ENode<Integer> left = new ENode(2);
        ENode<Integer> right = new ENode(3);

        root.setLeft(left);
        root.setRight(right);

        ENode<Integer> left1 = new ENode(4);
        ENode<Integer> right1 = new ENode(5);

        left.setLeft(left1);
        left.setRight(right1);

        ENode<Integer> left2 = new ENode(6);
        ENode<Integer> right2 = new ENode(7);


        right.setLeft(left2);
        right.setRight(right2);

//        Map<Integer, LinkedList> levels = new HashMap<Integer, LinkedList>();
//        listOfDepth(root, 0, levels);
//        System.out.println(levels);

        ArrayList<LinkedList<ENode>> solution2 = createLevelLinkedList(root);
        for (LinkedList<ENode> item : solution2) {
            for (int i = 0; i < item.size(); i++) {
                System.out.print(item.get(i).getData() + ", ");
            }
            System.out.println("");
        }
    }

    public static void listOfDepth(ENode node, int level, Map depth) {
        if (node == null) return;
        listOfDepth(node.getLeft(), level + 1, depth);
        LinkedList list;
        if (depth.containsKey(level)) {
            list = (LinkedList) depth.get(level);
        } else {
            list = new LinkedList();
            depth.put(level, list);
        }
        int data = (int) node.getData();
        list.add(data);
        listOfDepth(node.getRight(), level + 1, depth);
    }

    public static ArrayList<LinkedList<ENode>> createLevelLinkedList(ENode root) {
        ArrayList<LinkedList<ENode>> result = new ArrayList<LinkedList<ENode>>();
        LinkedList<ENode> current = new LinkedList<ENode>();
        if (root != null) {
            current.add(root);
        }
        while (current.size() > 0) {
            result.add(current);
            LinkedList<ENode> parents = current; // Go to next level
            current = new LinkedList<ENode>();
            for (ENode parent : parents) {
                // Visits the children
                if (parent.getLeft() != null) {
                    current.add(parent.getLeft());
                }
                if (parent.getRight() != null) {
                    current.add(parent.getRight());
                }
            }
        }
        return result;
    }
}
