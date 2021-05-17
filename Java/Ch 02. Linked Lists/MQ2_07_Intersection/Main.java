package MQ2_07_Intersection;

import Library.LinkedList;

public class Main {

    public static void main(String args[]) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insert(list1, "1");
        list1.insert(list1, "2");
        list1.insert(list1, "3");
        list1.insert(list1, "4");
        LinkedList.Node intersectPoint = list1.insert(list1, "5");
        list1.insert(list1, "6");
        list1.insert(list1, "7");

        list2.insert(list2, "8");
        list1.insert(list2, "9");
        list1.insert(list2, "10");
        LinkedList.Node intersectLink = list1.insert(list2, "11");


        list1.link2Lists(intersectPoint, intersectLink);
        list1.print(list1);
        list2.print(list2);
        list1.intersection(list1, list2);

    }
}
