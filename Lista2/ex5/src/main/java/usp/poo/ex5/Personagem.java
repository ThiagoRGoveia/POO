package usp.poo.ex5;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Objects;

class Personagem {
    private String nome;
    private String nomeVidaReal;
    protected ArrayList<Superpoder> poderes;
    private int vida;

    Personagem (ArrayList<Superpoder> pPoderes, int pVida) {
        poderes = pPoderes;
        vida = pVida;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public double getTotalPoder() {
        double totalPoder = 0;
        for (int i = 0; i <= poderes.size(); i++) {
            totalPoder += poderes.get(i).getCategoria();
        }
        return totalPoder;
    }

    public void setNome(String pNome) {
        nome = pNome;
    }

    public void setNomeVidaReal(String pNomeVidaReal) {
        nomeVidaReal = pNomeVidaReal;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int pVida) {
       vida = pVida;
    }

    public void adicionarSuperPoder(Superpoder superpoder) {
        poderes.add(superpoder);
    }

    public void atacar (int intensidade, String nomeDoSuperpoder, Personagem personagem) {
        Superpoder superpoder = buscarPoderPorNome(nomeDoSuperpoder);
        if (!Objects.isNull(superpoder) && superpoder.getTipo() == "Ataque") {
            if (personagem.defender(superpoder)) {
                if (Math.random() < 0.5) {
                    personagem.setVida(personagem.getVida() - intensidade * superpoder.getFator());
                }
            }
        }
    }

    public boolean defender (Superpoder poderAtacante) {
        Superpoder superpoder = buscarPoderPorCategoria(poderAtacante.getCategoria());
        if (!Objects.isNull(superpoder) && superpoder.getTipo() == "Defesa") {
            if (Math.random() < 0.5) {
                return true;
            }
        }
        return false;
    }


    private Superpoder buscarPoderPorNome (String nomeDoSuperpoder) {
        Superpoder superpoder;
        for (int i = 0; i <= poderes.size(); i++) {
            superpoder = poderes.get(i);
            if (superpoder.getNome() == nomeDoSuperpoder) {
                return superpoder;
            }
        }
        return null;
    }

    private Superpoder buscarPoderPorCategoria (int categoriaDoSuperpoder) {
        Superpoder superpoder;
        for (int i = 0; i <= poderes.size(); i++) {
            superpoder = poderes.get(i);
            if (superpoder.getCategoria() == categoriaDoSuperpoder) {
                return superpoder;
            }
        }
        return null;
    }
}