package MQ2_02_Return_Kth_To_Last;

import Library.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList list1 = new LinkedList();
        list1.insert(list1, "a");
        list1.insert(list1, "b");
        list1.insert(list1, "c");
        list1.insert(list1, "d");
        list1.insert(list1, "e");
        list1.insert(list1, "f");
        list1.print(list1);

        String result = list1.KthTOLast(list1, 2);
        System.out.println("result: " + result);
    }
}
