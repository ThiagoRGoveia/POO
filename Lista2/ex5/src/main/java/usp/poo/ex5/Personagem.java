package usp.poo.ex5;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Objects;
/*
 * Classe Personagem, recebe uma ArrayList de poderes e a vida do personagem
 * pelo construtor
 */
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
        for (int i = 0; i < poderes.size(); i++) {
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
       vida = pVida > 0 ? pVida : 0;
    }

    public void adicionarSuperPoder(Superpoder superpoder) {
        poderes.add(superpoder);
    }

    /**
     * Método que realiza o ataque com 50% de chance de sucesso caso não exista defesa
     * que anula o ataque, que então passa a ter 25% de chance de sucesso
     */
    public boolean atacar (int intensidade, String nomeDoSuperpoder, Personagem personagem) {
        Superpoder superpoder = buscarPoderPorNome(nomeDoSuperpoder);
        if (!Objects.isNull(superpoder) && superpoder.getTipo() == "Ataque") {
            if (!personagem.defender(superpoder)) {
                if (Math.random() < 0.5) {
                    personagem.setVida(personagem.getVida() - intensidade * superpoder.getFator());
                    return true;
                }
            }
            return false;
        } else {
            System.out.println("Personagem não possui esse ataque");
            return false;
        }
    }
    /**
     * Método que realiza a defesa, caso exista um superpoder de mesma categoria
     * exite 50% de chance de o ataque ser anulado.
     */
    public boolean defender (Superpoder poderAtacante) {
        Superpoder superpoder = buscarPoderPorCategoria(poderAtacante.getCategoria());
        if (!Objects.isNull(superpoder) && superpoder.getTipo() == "Defesa") {
            if (Math.random() < 0.5) {
                return true;
            }
        }
        return false;
    }

    /**
     * Busca superpoder com base em seu nome
     */
    private Superpoder buscarPoderPorNome (String nomeDoSuperpoder) {
        Superpoder superpoder;
        for (int i = 0; i < poderes.size(); i++) {
            superpoder = poderes.get(i);
            if (superpoder.getNome() == nomeDoSuperpoder) {
                return superpoder;
            }
        }
        return null;
    }
    /**
     * Busca superpoder com base em sua categoria
     */
    private Superpoder buscarPoderPorCategoria (int categoriaDoSuperpoder) {
        Superpoder superpoder;
        for (int i = 0; i < poderes.size(); i++) {
            superpoder = poderes.get(i);
            if (superpoder.getCategoria() == categoriaDoSuperpoder) {
                return superpoder;
            }
        }
        return null;
    }
}