package usp.poo.ex9;

public class Main {
    public static void main(String[] args) {
        Multiplo multiplo = new MultiploDeDois(new MultiploDeTres(new MultiploDemais(null)));

        System.out.println(multiplo.raiz(16));
        System.out.println(multiplo.quadrado(4));
        System.out.println(multiplo.raiz(9));
        System.out.println(multiplo.quadrado(3));
        System.out.println(multiplo.raiz(25));
        System.out.println(multiplo.quadrado(5));

    }
}
