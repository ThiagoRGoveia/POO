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
        Node<T> parent = null;

        // start with the root node
        Node<T> current = root;

        // search key in the BST and set its parent pointer
        while (current != null && !current.getEntry().equals(entry))
        {
            // update the parent to the current node
            parent = current;

            // if the given key is less than the current node, go to the left subtree;
            // otherwise, go to the right subtree
            if (key < current.data) {
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }

        // Case 1: node to be deleted has no children, i.e., it is a leaf node
        if (current.getLeft() == null && current.getRight() == null)
        {
            // if the node to be deleted is not a root node, then set its
            // parent left/right child to null
            if (current != root)
            {
                if (parent.getLeft() == current) {
                    parent.setLeft(null);
                }
                else {
                    parent.setRight(null);
                }
            }
            // if the tree has only a root node, set it to null
            else {
                root = null;
            }
        }

        // Case 2: node to be deleted has two children
        else if (current.getLeft() != null && current.getRight() != null)
        {
            // find its inorder successor node
            Node<T> successor = getMinimumKey(current.getRight());

            // store successor value
            int val = successor.data;

            // recursively delete the successor. Note that the successor
            // will have at most one child (right child)
            deleteNode(root, successor.data);

            // copy value of the successor to the current node
            current.data = val;
        }

        // Case 3: node to be deleted has only one child
        else {
            // choose a child node
            Node<T> child = (current.getLeft() != null)? current.getLeft(): current.getRight();

            // if the node to be deleted is not a root node, set its parent
            // to its child
            if (current != root)
            {
                if (current == parent.getLeft()) {
                    parent.setLeft(child);
                }
                else {
                    parent.setRight(child);
                }
            }

            // if the node to be deleted is a root node, then set the root to the child
            else {
                root = child;
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
        if (!node.isDeleted()) {
            System.out.print(node.getEntry() + " ");
        }
        print(node.getRight());
    }

}