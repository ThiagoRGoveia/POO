package usp.poo.lista1.ex2;

/*
 * Testa classe SistemaOperacional
 */
public class Main {
    public static void main(String[] args) {
        Rede $rede= new Rede();
        Impressora $impressora = new Impressora();
        Video $video = new Video(0.8);
        SistemaOperacional sys = new SistemaOperacional($rede, $impressora, $video);
        sys.executaTeste();
        sys.ligarRede();
        sys.ligarImpressora();
        sys.ligarVideo();
        sys.executaTeste();

        sys.impressora.imprimePáginas("Texto teste", 2);
        sys.video.alteraBrilhoDeExibição(0.9);
        sys.rede.enviaPacoteDeDados(11000);

    }
}
