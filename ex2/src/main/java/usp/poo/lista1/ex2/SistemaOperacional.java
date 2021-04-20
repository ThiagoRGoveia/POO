package usp.poo.lista1.ex2;

public class SistemaOperacional {
    public Rede rede;
    public Impressora impressora;
    public Video video;

    SistemaOperacional(Rede rede, Impressora impressora, Video video) {
        this.rede = rede;
        this.impressora = impressora;
        this.video = video;
    }

    public void executaTeste() {
        System.out.println("Executando teste...");
        System.out.println("Rede: " + rede.executaTeste());
        System.out.println("Impressora: " + impressora.executaTeste());
        System.out.println("Vídeo" + video.executaTeste());
        System.out.println("Teste concluído");
    }

    public Rede getRede() {
        return rede;
    }

    public Impressora getImpressora() {
        return impressora;
    }

    public Video getVideo() {
        return video;
    }

    public void ligarRede() {
        rede.ligaDispositivo();
    }

    public void ligarImpressora() {
        impressora.ligaDispositivo();
    }

    public void ligarVideo() {
        video.ligaDispositivo();
    }

}