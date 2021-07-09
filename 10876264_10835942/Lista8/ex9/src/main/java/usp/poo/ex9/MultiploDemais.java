package usp.poo.ex9;

public class MultiploDemais extends Multiplo {

    public MultiploDemais(Multiplo sucessor) {
        super(sucessor);
    }

    public double raiz(int numero) {
        System.out.println("Calculando a raíz de um número que não é multiplo de 2 nem de 3");
        return Math.sqrt(numero);

    }

    public int quadrado(int numero) {
        System.out.println("Calculando o quadrado de um número que não é multiplo de 2 nem de 3");
        return numero * numero;
    }
}
