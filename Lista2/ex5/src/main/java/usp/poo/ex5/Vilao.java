package usp.poo.ex5;

import java.util.ArrayList;
/*
 * Classe Vilão extende personagem
 */
public class Vilao extends Personagem {
    private int anosDePrisao;

    Vilao(ArrayList<Superpoder> poderes, int vida) {
        super(poderes, vida);
    }

    public int getAnosDePrisao() {
        return anosDePrisao;
    }

    public void setAnosDePrisao(int panosDePrisao) {
        anosDePrisao = panosDePrisao;
    }

}
