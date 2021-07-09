package usp.poo.ex9;

public abstract class Multiplo {
    protected Multiplo sucessor;

    public Multiplo(Multiplo sucessor) {
        this.sucessor = sucessor;
    }

    public abstract double raiz(int numero);
    public abstract int quadrado(int numero);
}
