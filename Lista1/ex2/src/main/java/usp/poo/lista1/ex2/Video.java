package usp.poo.lista1.ex2;
/*
 * Classe que define dispositivo Video que herda de Drivers
 */
public class Video extends Drivers{
    private double brilho;
    // Construtor inicia contrutor de Drivers com o status inicial
    Video (double brilho) {
        super("Desligado");
        this.brilho = brilho;
    }
    // Modifica status e altera o brilho
    public void alteraBrilhoDeExibição (double brilho) {
        setStatus("Alterando brilho pada " + brilho);
        this.brilho = brilho;
        setStatus("Ligado");
    }
    // Recupera brilho do vídeo
    public double getBrilho () {
        return brilho;
    }
}
