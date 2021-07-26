package Main;




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
        System.out.println("3 - Recuperar jogo");
        System.out.println("4 - Sair");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                new Main().newGame();

                break;
            case 2:
                new Main().loadGame();
                break;
            case 3:
                new Main().recoverGame();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }

    private Main() {
        gm = new GameManager();
    }

    private void newGame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gm.newGame();
                gm.autoSave();
            }
        });
    }

    private void loadGame() throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gm.loadGame();
                    gm.autoSave();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void recoverGame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gm.recoverGame();
                    gm.autoSave();
                } catch (Exception e) {
                    System.out.println("Não foi possível recuperar o jogo");
                }
            }
        });
    }
}


