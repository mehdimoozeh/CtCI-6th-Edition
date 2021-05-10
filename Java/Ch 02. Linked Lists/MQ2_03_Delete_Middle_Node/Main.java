package MQ2_03_Delete_Middle_Node;

import Library.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList list1 = new LinkedList();
        list1.insert(list1, "a");
        list1.insert(list1, "b");
        LinkedList.Node target = list1.insert(list1, "c");
        list1.insert(list1, "d");
        list1.insert(list1, "e");
        list1.insert(list1, "f");
        list1.print(list1);

        list1.deleteMiddleNode(target);
        list1.print(list1);
    }
}
