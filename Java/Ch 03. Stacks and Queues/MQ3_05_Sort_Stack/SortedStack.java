package MQ3_05_Sort_Stack;

import java.util.Stack;

public class SortedStack {
    private Stack<Integer> mainStack = new Stack<Integer>();
    private Stack<Integer> tempStack = new Stack<Integer>();

    public SortedStack() {
    }

    public void push(int data) {
        if (tempStack.isEmpty() && mainStack.isEmpty()) {
            mainStack.push(data);
            return;
        }
        if (!tempStack.isEmpty() && data > tempStack.peek() && data < mainStack.peek()) {
            tempStack.push(data);
            return;
        }
        mergeStacks();
        while (!mainStack.isEmpty()) {
            if (mainStack.peek() > data) {
                break;
            }
            tempStack.push(mainStack.pop());
        }
        mainStack.push(data);
    }

    private void mergeStacks() {
        while (!tempStack.empty()) {
            mainStack.push(tempStack.pop());
        }
    }

    public int pop() {
        mergeStacks();
        if (mainStack.isEmpty()) {
            return -1;
        }
        return mainStack.pop();
    }

}

