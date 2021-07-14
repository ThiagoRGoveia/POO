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
                    System.out.println("Element already exists");
                    return;
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
                return current;
            }
        }
        return null;
    }

    public void delete(T entry) {
        delete(null, root, entry);
    }

    public void delete(Node<T> parentNode, Node<T> node, T entry) {
        if (node.getEntry().equals(entry)) {
            if (node.getLeft() == null) {
                if (parentNode != null) {
                    parentNode.delete(node);
                } else {
                    root = null;
                }
            } else {
                T temp = node.getLeft().getEntry();
                delete(node, node.getLeft(), temp);
                node.setEntry(temp);
            }
        } else {
            if (node.getLeft() != null) {
                delete(node, node.getLeft(), entry);
            } else if (node.getRight() != null) {
                delete(node, node.getRight(), entry);
            } else {
                return;
            }
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
        System.out.print(node.getEntry() + " ");
        print(node.getRight());
    }

}