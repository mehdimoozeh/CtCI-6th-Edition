package MQ3_02_Stack_Min;

import helper.Stack;

public class Main {
    public static void main(String args[]) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        try {
            myStack.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        myStack.push(3);

        try {
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
