package usp.poo.lista1.ex2;

public class Video extends Drivers{
    private double brilho;

    Video (double brilho) {
        super("Desligado");
        this.brilho = brilho;
    }

    public void alteraBrilhoDeExibição (double brilho) {
        setStatus("Alterando brilho pada " + brilho);
        this.brilho = brilho;
        setStatus("Ligado");
    }

    public double getBrilho () {
        return brilho;
    }
}
