package usp.poo.ex5;

import java.util.ArrayList;
import java.lang.Math;
/*
 * Classe Main realiza a batalha entre herói e vilão
 */
public class Main {
    public static void main(String[] args) {
        // Instanciação dos poderes e personagem
        ArrayList<Superpoder> poderesHeroi = new ArrayList<Superpoder>(3);
        ArrayList<Superpoder> poderesVilao = new ArrayList<Superpoder>(3);
        poderesHeroi.add(
            new Superpoder(1, "Ataque", "Kamehameha", 2 )
        );
        poderesHeroi.add(
            new Superpoder(2, "Defesa", "Shield", 0 )
        );

        poderesVilao.add(
            new Superpoder(2, "Ataque", "Makankosappo", 2 )
        );
        poderesVilao.add(
            new Superpoder(2, "Defesa", "Shield", 0 )
        );

        SuperHeroi heroi = new SuperHeroi(poderesHeroi, 200);
        heroi.setNome("Goku");
        heroi.setNomeVidaReal("Kakaroto");
        Vilao vilao = new Vilao(poderesVilao, 150);
        vilao.setNome("Pikkoro");

        boolean heroiEstaAtacando = false;
        boolean ataqueBemSucedido = true;
        int ataque;

        // Luta acontece enquanto ambos possuírem vida maior que zero
        while (vilao.getVida() > 0 && heroi.getVida() > 0) {
            ataque = (int) (Math.random() * 10);
            if (heroiEstaAtacando) {
                System.out.println("Heroi ataca");
                ataqueBemSucedido = heroi.atacar(ataque, "Kamehameha", vilao);
                if (ataqueBemSucedido) {
                    System.out.println("Sucesso! Vida do vilão " + vilao.getVida());
                }
            } else {
                System.out.println("Vilao ataca");
                ataqueBemSucedido = vilao.atacar(ataque, "Makankosappo", heroi);
                if (ataqueBemSucedido) {
                    System.out.println("Sucesso! Vida do herói " + heroi.getVida());
                }
            }
            if (!ataqueBemSucedido) {
                System.out.println("Ataque falhou");
            }
            heroiEstaAtacando = !heroiEstaAtacando;
        }
        System.out.println("Vida do heroi " + heroi.getVida());
        System.out.println("Vida do vilão " + vilao.getVida());
    }
}
