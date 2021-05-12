package MQ2_04_Partition;

import Library.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList list1 = new LinkedList();
        list1.insert(list1, "3");
        list1.insert(list1, "5");
        list1.insert(list1, "8");
        list1.insert(list1, "5");
        list1.insert(list1, "10");
        list1.insert(list1, "2");
        list1.insert(list1, "1");
        list1.print(list1);

        list1.partition(list1, 5);
    }
}
