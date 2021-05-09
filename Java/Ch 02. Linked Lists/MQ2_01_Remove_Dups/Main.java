package MQ2_01_Remove_Dups;

import Library.LinkedList;

public class Main {

    public static void main(String args[]) {
        LinkedList list1 = new LinkedList();
        list1.insert(list1, "F");
        list1.insert(list1, "O");
        list1.insert(list1, "L");
        list1.insert(list1, "L");
        list1.insert(list1, "O");
        list1.insert(list1, "W");
        list1.insert(list1, " ");
        list1.insert(list1, "U");
        list1.insert(list1, "P");
         list1.print(list1);

        list1.removeDup1(list1);
        list1.print(list1);
    }
}
