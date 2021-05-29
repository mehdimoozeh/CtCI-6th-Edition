package MQ3_03_Stack_of_Plates;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {
    private int itemLimitations = 10;
    private ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
    private int currentStackIndex = -1;


    public StackOfPlates() {
        this.addNewStack();
    }

    public StackOfPlates(int stackItemsLimitation) {
        this.itemLimitations = stackItemsLimitation;
        this.addNewStack();
    }

    private void addNewStack() {
        this.stacks.add(new Stack<Integer>());
        this.currentStackIndex++;
    }

    private int removeEmptyStack(int targetIndex) {
        if (this.stacks.get(targetIndex).size() == 0) {
            this.stacks.remove(targetIndex);
            this.currentStackIndex--;
        }
        return this.currentStackIndex;
    }

    public void push(int data) {
        if (this.stacks.get(this.currentStackIndex).size() == itemLimitations) {
            this.addNewStack();
        }
        this.stacks.get(this.currentStackIndex).push(data);
    }

    public int pop() {
        if (this.currentStackIndex < 0) {
            return -1;
        }
        int data = this.stacks.get(this.currentStackIndex).pop();
        this.removeEmptyStack(this.currentStackIndex);
        return data;
    }

    public int popAt(int index) {
        if (index >= 0 && index <= this.currentStackIndex) {
            int data = this.stacks.get(index).pop();
            this.removeEmptyStack(index);
            return data;
        }
        return -1;
    }

    public int size() {
        return this.currentStackIndex + 1;
    }
}
