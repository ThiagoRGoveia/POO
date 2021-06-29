package usp.poo.ex6;

import java.util.Arrays;
import java.util.HashSet;

public class CalculardorDeUniao implements Calculador{

    public void calcular(Integer[] a, Integer[] b) {
        HashSet<Integer> uniao = new HashSet<Integer>();
        uniao.addAll(Arrays.asList(a));
        uniao.addAll(Arrays.asList(b));
        System.out.println("União: " + uniao);
    }

}
