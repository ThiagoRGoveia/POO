package usp.poo.ex9;

public class MultiploDeTres extends Multiplo {

    public MultiploDeTres(Multiplo sucessor) {
        super(sucessor);
    }

    public double raiz(int numero) {
        if (numero % 3 == 0) {
            System.out.println("Calculando a raíz de um número múltiplo de 3");
            return Math.sqrt(numero);
        } else {
            return sucessor.raiz(numero);
        }
    }

    public int quadrado(int numero) {
        if (numero % 3 == 0) {
            System.out.println("Calculando o quadrado de um número múltiplo de 3");
            return numero * numero;
        } else {
            return sucessor.quadrado(numero);
        }
    }
}
