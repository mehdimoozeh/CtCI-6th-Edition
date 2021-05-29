package MQ3_02_Stack_Min;

import helper.Stack;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Stack mainStack = new Stack();
        Stack minStack = new Stack();

        // Fill stack with random numbers
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int r = random.nextInt(100);
            mainStack.push(r);
            try {
                if (minStack.isEmpty() || r <= minStack.getTop()) {
                    minStack.push(r);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Pop from stack and check the last minimum
        for (int j = 0; j < 100; j++) {
            try {
                int min = minStack.getTop();
                int top = mainStack.pop();
                if (minStack.getTop() == top) {
                    min = minStack.pop();
                }
                System.out.println("item popped: " + top + ", minimum: " + min);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
