package usp.poo.ex6;

public class MainB {
    public static void main (String[] args) {
        Impressora impressoraA = new ImpressoraJatoDeTinta();
        Impressora impressoraB = new ImpressoraLaser();

        System.out.println(impressoraA.checarStatus());
        impressoraA.ligar();
        System.out.println(impressoraA.checarStatus());
        impressoraA.calibrar();
        System.out.println(impressoraA.checarStatus());
        impressoraA.atualizarDriver();
        impressoraA.desligar();
        System.out.println(impressoraA.checarStatus());

        System.out.println();

        System.out.println(impressoraB.checarStatus());
        impressoraB.ligar();
        System.out.println(impressoraB.checarStatus());
        impressoraB.calibrar();
        System.out.println(impressoraB.checarStatus());
        impressoraB.atualizarDriver();
        impressoraB.desligar();
        System.out.println(impressoraB.checarStatus());

    }
}
