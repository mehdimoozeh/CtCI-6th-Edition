package MQ3_04_Queue_via_Stacks;


public class Main {

    public static void main(String args[]) {
        MyQueue<Integer> customQueue = new MyQueue<Integer>();

        customQueue.add(1);
        customQueue.add(2);
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        customQueue.add(3);
        System.out.println(customQueue.peek());
        customQueue.add(4);
        customQueue.add(5);
        customQueue.add(6);
        customQueue.add(7);

        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
    }

}
