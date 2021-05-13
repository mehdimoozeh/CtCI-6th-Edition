package MQ2_05_Sum_Lists;

import Library.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList num1 = new LinkedList();
        // 617
        num1.insert(num1, "7");
        num1.insert(num1, "1");
        num1.insert(num1, "8");
        num1.insert(num1, "1");

        LinkedList num2 = new LinkedList();
        // 592
        num2.insert(num2, "5");
        num2.insert(num2, "9");
        num2.insert(num2, "2");

        LinkedList result = num1.sumLists(num1, num2);
        result.print(result);
    }
}
