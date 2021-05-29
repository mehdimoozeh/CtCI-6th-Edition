package MQ3_03_Stack_of_Plates;

public class Main {
    public static void main(String args[]) {
        StackOfPlates stack = new StackOfPlates(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);


        System.out.println("Stacks created " + stack.size());
        System.out.println("Item: " + stack.popAt(10));
        System.out.println("Item: " + stack.popAt(0));
        System.out.println("Item: " + stack.popAt(0));
        System.out.println("Item: " + stack.popAt(0));
        System.out.println("Item: " + stack.popAt(0));
        System.out.println("Item: " + stack.popAt(0));
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());
        System.out.println("Item: " + stack.pop());

    }
}
