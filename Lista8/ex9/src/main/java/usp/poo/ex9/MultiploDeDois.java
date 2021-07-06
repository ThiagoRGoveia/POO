package usp.poo.ex9;


public class MultiploDeDois extends Multiplo {

    public MultiploDeDois(Multiplo sucessor) {
        super(sucessor);
    }

    public double raiz(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Calculando a raíz de um número múltiplo de 2");
            return Math.sqrt(numero);
        } else {
            return sucessor.raiz(numero);
        }
    }

    public int quadrado(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Calculando o quadrado de um número múltiplo de 2");
            return numero * numero;
        } else {
            return sucessor.quadrado(numero);
        }
    }

}
