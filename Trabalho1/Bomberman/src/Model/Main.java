package Model;



import java.util.Scanner;

import Controls.GameManager;

public class Main {

    private GameManager gm;
    /**
     * @param args the command line arguments
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo Bomberman!");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Carregar jogo");
        System.out.println("3 - Sair");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                new Main().newGame();
                break;
            case 2:
                new Main().loadGame();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();

        // System.out.println("OI " + String.format("%b", 1 == 2));

    }

    private Main() {
        gm = new GameManager();
    }

    private void newGame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gm.newGame();
            }
        });
    }

    private void loadGame() throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gm.loadGame();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


