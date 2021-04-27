package usp.poo.ex5;

import java.util.ArrayList;
/*
 * Classe SuperHeroi extende personagem
 */
public class SuperHeroi extends Personagem {

    SuperHeroi(ArrayList<Superpoder> poderes, int vida) {
        super(poderes, vida);
    }

    @Override
    public String getNomeVidaReal() {
        return "Nome na vida real do Herói" + super.getNomeVidaReal();
    }

    @Override
    public double getTotalPoder() {
        return super.getTotalPoder();
    }
}
