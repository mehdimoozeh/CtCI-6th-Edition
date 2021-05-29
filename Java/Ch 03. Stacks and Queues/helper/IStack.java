package helper;

public interface IStack {

    public void push(int data);

    public int pop() throws Exception;

    public int getTop() throws Exception;
}
