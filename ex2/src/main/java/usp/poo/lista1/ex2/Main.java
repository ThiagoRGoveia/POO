package usp.poo.lista1.ex2;

public class Main {
    public static void main(String[] args) {
        SistemaOperacional sys = new SistemaOperacional(
            new Rede(),
            new Impressora(),
            new Video(0.8)
        );
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
