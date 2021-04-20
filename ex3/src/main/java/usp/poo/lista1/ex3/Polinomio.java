package usp.poo.lista1.ex3;

import java.util.ArrayList;
/*
 * Classe que define o polinomio,
 * possui um grau máximo e uma lista
 * termos com variáveis de instância
 */
public class Polinomio {
    private int grauMaximo;
    private ArrayList<Termo> termos;
    /*
    * Construtor recebe um grau máximo e popula
    * lista de Termos com valor inicial 0 e grau
    * iterando  até o grau máximo
    */
    Polinomio (int grauMaximo) {
        this.termos = new ArrayList<Termo>();
        this.grauMaximo = grauMaximo;
        for (int i = 0; i <= grauMaximo; i++) {
            termos.add(new Termo(i, 0));
        }
    }
    /*
     * Acidiciona termo verificando se grau máximo
     * foi respeitado
     */
    public void add (Termo termo) {
        if (termo.grau <= grauMaximo) {
            Termo termoAnterior = termos.get(termo.grau);
            termos.set(
                termo.grau, new Termo(
                    termo.grau,
                    termo.valor + termoAnterior.valor
                    )
                );
        } else {
            System.out.println("Este termo não respeita o grau máximo do Polinomio");
        }
    }

    /**
    * Imprime polinômio na tela, os termos de grau 1 e 0
    * são impressos com formatação diferenciada
    */
    public void mostra () {
        for (int i = grauMaximo; i > 1; i--) {
            Termo termo = termos.get(i);
           System.out.printf("%.2fx^%d + ", termo.valor, termo.grau);
        }
        System.out.printf("%.2fx + ", termos.get(1).valor);
        System.out.printf("%.2f\n", termos.get(0).valor);
    }
    // Calcula valor do polinômio para um determinado x
    public double calcula (double x) {
        double resultado = 0;
        for (int i = grauMaximo; i >= 0; i--) {
           resultado += termos.get(i).valor * Math.pow(x, (double) termos.get(i).grau);
        }
        return resultado;
    }
}
