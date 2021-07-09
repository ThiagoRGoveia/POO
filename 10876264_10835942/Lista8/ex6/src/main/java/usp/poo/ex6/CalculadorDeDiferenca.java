package usp.poo.ex6;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculadorDeDiferenca implements Calculador {

    public void calcular(Integer[] a, Integer[] b) {
        ArrayList<Integer> diferenca = new ArrayList<Integer>();
        for (int numero: a) {
            if (!Arrays.asList(b).contains(numero)) {
                diferenca.add(numero);
            }
        }
       System.out.println("Diferença" + diferenca);
    }

}
