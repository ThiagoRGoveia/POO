package usp.poo.ex5;

import java.util.ArrayList;

public class SuperHeroi extends Personagem {

    SuperHeroi(ArrayList<Superpoder> poderes, int vida) {
        super(poderes, vida);
    }

    @Override
    public String getNomeVidaReal() {
        return super.getNomeVidaReal();
    }

    @Override
    public double getTotalPoder() {
        return super.getTotalPoder();
    }
}
