package usp.poo.ex6;

public class Main {
    public static void main (String[] args) {
        Impressora impressora = new Impressora();

        System.out.println(impressora.checarStatus());
        impressora.ligar();
        System.out.println(impressora.checarStatus());
        impressora.calibrar();
        impressora.atualizarDriver();
        impressora.desligar();
        System.out.println(impressora.checarStatus());

    }
}
