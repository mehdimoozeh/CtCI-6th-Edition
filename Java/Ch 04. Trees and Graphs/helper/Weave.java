package helper;

import java.util.ArrayList;
import java.util.LinkedList;

public class Weave {


    public static void main(String args[]) {
        LinkedList<Integer> first = new LinkedList<>();
        first.add(1);
        first.add(2);

        LinkedList<Integer> second = new LinkedList<>();
        second.add(3);
        second.add(4);


        ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
        weave(first, second, new LinkedList<Integer>(), result);

       for (LinkedList<Integer> answer : result ) {
            for (int digit : answer) {
                System.out.print(digit + ", ");
            }
            System.out.println();
        }
    }


    public static void weave(LinkedList<Integer> first, LinkedList<Integer> second, LinkedList<Integer> prefix, ArrayList<LinkedList<Integer>> result) {
        LinkedList<Integer> clonedPrefix = (LinkedList<Integer>) prefix.clone();

        if (first.size() == 0 || second.size() == 0) {
            LinkedList<Integer> answer = new LinkedList<>();
            answer.addAll(clonedPrefix);
            answer.addAll(first);
            answer.addAll(second);
            result.add(answer);
            return;
        }

        // call first
        clonedPrefix.add(first.removeFirst());
//        printer(first, second, clonedPrefix);
        weave(first, second, clonedPrefix, result);
        first.addFirst(clonedPrefix.removeLast());

        // call second
        clonedPrefix.add(second.removeFirst());
//        printer(first, second, clonedPrefix);
        weave(first, second, clonedPrefix, result);
        second.addFirst(clonedPrefix.removeLast());
    }

    public static void printer(LinkedList<Integer> set1, LinkedList<Integer> set2, LinkedList<Integer> set3) {
        System.out.print("{");
        for (int digit : set1) {
            System.out.print(digit + ", ");
        }
        System.out.print("}, ");

        System.out.print("{");
        for (int digit : set2) {
            System.out.print(digit + ", ");
        }
        System.out.print("}, ");

        System.out.print("{");
        for (int digit : set3) {
            System.out.print(digit + ", ");
        }
        System.out.print("}");
        System.out.println();
    }
}
