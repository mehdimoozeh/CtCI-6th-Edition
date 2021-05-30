package MQ3_04_Queue_via_Stacks;

import java.util.Stack;

public class MyQueue<T> {
    private Stack<T> holderStack;
    private Stack<T> queueStack;

    public MyQueue() {
        holderStack = new Stack<T>();
        queueStack = new Stack<T>();
    }

    public void add(T data) {
        holderStack.push(data);
    }

    private void syncStacks() {
        if (queueStack.isEmpty()) {
            while (!holderStack.isEmpty()) {
                queueStack.push(holderStack.pop());
            }
        }
    }

    public T remove() {
        syncStacks();
        return this.queueStack.pop();
    }

    public T peek() {
        syncStacks();
        return this.queueStack.peek();
    }

    public boolean isEmpty() {
        return holderStack.size() == 0 && queueStack.size() == 0;
    }
}
