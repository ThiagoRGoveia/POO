package usp.poo.ex3;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<PegadaDeCarbono> pegadas = new ArrayList<PegadaDeCarbono>();
        // RESPOSTA: O código não funcionará se Predio for uma classe abstrata, pois essas classes
        // não podem ser instanciadas.
        // pegadas.add(
        //     new Predio(5,3,20)
        // );
        // pegadas.add(
        //     new Predio(10,6,60)
        // );

        pegadas.add(
            new Casa(1, 4, 2)
        );
        pegadas.add(
            new Escola(4, 8, 15, "COC")
        );
        pegadas.add(
            new Carro("Gol", 2018, 20000)
        );
        pegadas.add(
            new Carro("Fusca", 1970, 50000)
        );
        pegadas.add(
            new Bicicleta("Giant")
        );
        pegadas.add(
            new Bicicleta("Caloi")
        );

        for (int i = 0; i < pegadas.size(); i++) {
            PegadaDeCarbono entidade = pegadas.get(i);
            System.out.println("Pegada de carbono do(a) " +  entidade.getClass().getSimpleName() + ": " + entidade.getPegadaDeCarbono());
        }

    }
}
