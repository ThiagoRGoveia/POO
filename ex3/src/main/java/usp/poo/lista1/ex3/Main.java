
package usp.poo.lista1.ex3;

public class Main {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio(3);

        polinomio.add(
            new Termo(0, 3)
        );

        polinomio.add(
            new Termo(1, 2)
        );

        polinomio.add(
            new Termo(2, 5)
        );

        polinomio.add(
            new Termo(3, 8)
        );

        polinomio.mostra();

        double resultado = polinomio.calcula(2);
        System.out.println(resultado);
    }
}
