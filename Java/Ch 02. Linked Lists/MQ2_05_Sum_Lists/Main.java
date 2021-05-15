package MQ2_05_Sum_Lists;

import Library.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList num1 = new LinkedList();
        num1.insert(num1, "7");
        num1.insert(num1, "1");
        num1.insert(num1, "8");

        LinkedList num2 = new LinkedList();
        num2.insert(num2, "5");
        num2.insert(num2, "9");
        num2.insert(num2, "2");

        question1(num1, num2);
        question2(num1, num2);

    }

    public static void question1(LinkedList num1, LinkedList num2) {
        LinkedList result = num1.sumLists(num1, num2);
        result.print(result); // 2111
    }

    public static void question2(LinkedList num1, LinkedList num2) {
        num1.sumListsForward(num1, num2); // 1310
    }
}
