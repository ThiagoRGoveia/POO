package usp.poo.ex4;

public class Stack {
    private int[] stack;
    private int size;
    private int position;

    Stack (int size) {
        stack = new int[size];
        this.size = size;
        position = 0;
    }

    public void push(int element) throws StackIsFullException{
        if (position == size) {
            throw new StackIsFullException();
        }
        stack[position++] = element;
    }

    public int pop () throws StackIsEmptyException{
        if (position == 0) {
            throw new StackIsEmptyException();
        }
        return stack[--position];
    }

    public int getSize() {
        return size;
    }


}
