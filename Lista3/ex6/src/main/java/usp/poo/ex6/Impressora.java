package usp.poo.ex6;

public abstract class Impressora implements Ligavel, PossuiStatus, Calibravel {
    public abstract void ligar();
    public abstract void desligar();
    public abstract String checarStatus ();
    public abstract boolean calibrar ();
    public abstract void atualizarDriver();
}
