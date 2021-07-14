package usp.poo.ex3;

public class Node<T> {
    private T entry;
    private Node<T> left;
    private Node<T> right;

    public Node(T entry) {
        this.entry = entry;
        left = null;
        right = null;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    public T getEntry() {
        return entry;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public void setEntry(T entry) {
        this.entry = entry;
    }

    public void delete(Node<T> node) {
        if (left == node) {
            left = null;
        } else if (right == node) {
            right = null;
        }
    }
}
