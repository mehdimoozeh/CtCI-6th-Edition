package helper;

public class Stack implements IStack {
    private class Item {
        public int data;
        public Item next = null;

        public Item(int data) {
            this.data = data;
        }
    }

    private Item topItem = null;

    public Stack() {
    }

    @Override
    public void push(int data) {
        Item item = new Item(data);
        item.next = topItem;
        this.topItem = item;
    }

    @Override
    public int pop() throws Exception {
        if (this.topItem == null) {
            throw new Exception("Stack is empty!");
        }
        int result = this.topItem.data;
        this.topItem = this.topItem.next;
        return result;
    }

    @Override
    public int getTop() throws Exception {
        if (this.topItem == null) {
            throw new Exception("Stack is empty!");
        }
        return topItem.data;
    }

    public boolean isEmpty() {
        if (this.topItem == null) {
            return true;
        }
        return false;
    }
}
