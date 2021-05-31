package MQ3_05_Sort_Stack;

public class Main {
    public static void main(String args[]) {
        SortedStack stack = new SortedStack();

        stack.push(10);
        stack.push(8);
        stack.push(9);
        stack.push(7);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
