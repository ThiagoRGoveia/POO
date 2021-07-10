package usp.poo.ex3;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer>  bTree = new BinaryTree<Integer>();

        bTree.insert(50);
        bTree.insert(40);
        bTree.insert(30);
        bTree.insert(22);
        bTree.insert(60);
        bTree.insert(9);
        bTree.insert(100);
        bTree.insert(1);

        bTree.print();

        for (int i = 0; i < 2; i++) {
            System.out.println("Buscando chave 22");
            Node<Integer> searchNode = bTree.search(22);
            if (searchNode != null) {
                System.out.println("Chave encontrada: " + bTree.search(22).getEntry());
                System.out.println("Deletando chave 22");
                bTree.delete(22);
            } else {
                System.out.println("Chave não encontrada");
            }
        }

        bTree.print();
        System.out.println("Inserindo chave 22");
        bTree.insert(22);
        bTree.print();
    }
}
