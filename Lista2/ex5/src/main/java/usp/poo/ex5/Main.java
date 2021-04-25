package usp.poo.ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Superpoder> poderesHeroi = new ArrayList<Superpoder>(3);
        ArrayList<Superpoder> poderesVilao = new ArrayList<Superpoder>(3);
        poderesHeroi.add(
            new Superpoder(1, "Ataque", "Kamehameha", 2 )
        );
        poderesHeroi.add(
            new Superpoder(2, "Defesa", "Shield", 0 )
        );
        poderesHeroi.add(
            new Superpoder(3, "Ataque", "Kaioken", 3 )
        );

        poderesVilao.add(
            new Superpoder(2, "Ataque", "Makankosappo", 2 )
        );
        poderesVilao.add(
            new Superpoder(1, "Defesa", "Shield", 0 )
        );
        poderesVilao.add(
            new Superpoder(4, "Defesa", "Teleport", 3 )
        );
        SuperHeroi heroi = new SuperHeroi(poderesHeroi, 200);
        heroi.setNome("Goku");
        heroi.setNomeVidaReal("Kakaroto");
        Vilao vilao = new Vilao(poderesVilao, 150);
        vilao.setNome("Pikkoro");

        boolean heroiEstaAtacando = false;

        while (vilao.getVida() > 0 && heroi.getVida() > 0) {
            if (heroiEstaAtacando) {
                System.out.println("Heroi ataca");
                heroi.atacar(10, "Kamehameha", vilao);
            } else {
                System.out.println("Vilao ataca");
                vilao.atacar(10, "Makankosappo", heroi);
            }
            heroiEstaAtacando = !heroiEstaAtacando;
        }
        System.out.println("Vida do heroi " + heroi.getVida());
        System.out.println("Vida do vilão " + vilao.getVida());
    }
}
