package usp.poo.ex3;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(T entry) {
        Node<T> node = new Node<T>(entry);
        if (root == null) {
            root = node;
        } else {
            Node<T> current = root;
            while (current != null) {
                if (current.getEntry().equals(node.getEntry())) {
                    if (current.isDeleted()) {
                        current.setEntry(entry);
                        current.restore();
                    } else {
                        return;
                    }
                } else if (current.getEntry().compareTo(node.getEntry()) > 0) {
                    if (current.getLeft() == null) {
                        current.setLeft(node);
                        break;
                    } else {
                        current = current.getLeft();
                    }
                } else {
                    if (current.getRight() == null) {
                        current.setRight(node);
                        break;
                    } else {
                        current = current.getRight();
                    }
                }
            }
        }
    }

    public Node<T> search(T entry) {
        Node<T> current = root;
        while (current != null) {
            if (current.getEntry().compareTo(entry) > 0) {
                current = current.getLeft();
            } else if (current.getEntry().compareTo(entry) < 0) {
                current = current.getRight();
            } else {
                if (!current.isDeleted()) {
                    return current;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void delete(T entry) {
        Node<T> nodeToBeDeleted = search(entry);
        if (nodeToBeDeleted != null) {
            nodeToBeDeleted.delete();
        }
    }

    public void print() {
        print(root);
        System.out.println();
    }

    public void print(Node<T> node)
    {
        if (node == null){
            return;
        }
        print(node.getLeft());
        if (!node.isDeleted()) {
            System.out.print(node.getEntry() + " ");
        }
        print(node.getRight());
    }

}