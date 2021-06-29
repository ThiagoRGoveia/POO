package usp.poo.ex6;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculadorDeInterseccao implements Calculador {

    public void calcular(Integer[] a, Integer[] b) {
        ArrayList<Integer> interseccao = new ArrayList<Integer>();
        for (int numero: a) {
            if (Arrays.asList(b).contains(numero)) {
                interseccao.add(numero);
            }
        }
       System.out.println("Intersecção" + interseccao);
    }

}
