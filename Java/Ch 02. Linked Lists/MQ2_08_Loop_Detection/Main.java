package MQ2_08_Loop_Detection;

import Library.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insert(list, "1");
        list.insert(list, "2");
        list.insert(list, "3");
        LinkedList.Node startOfLoop = list.insert(list, "4");
        list.insert(list, "5");
        list.insert(list, "6");
        list.insert(list, "7");
        list.insert(list, "8");
        list.insert(list, "9");
        // list.insert(list, "10");
        LinkedList.Node endOfLoop = list.insert(list, "11");

        list.link2Lists(startOfLoop, endOfLoop);

        list.detectLoop(list);
    }
}
