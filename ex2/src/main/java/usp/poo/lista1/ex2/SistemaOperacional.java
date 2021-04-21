package usp.poo.lista1.ex2;

/*
 * Sistema operacional, possui instancias de
 * Rede, Impressora e Video como classes agregadas
 */

public class SistemaOperacional {
    public Rede rede;
    public Impressora impressora;
    public Video video;

    /*
    * Contrutor recebe instancias de Rede, Impressora e Video  e as salva em
    * variáveis de instância.
    */
    SistemaOperacional(Rede rede, Impressora impressora, Video video) {
        this.rede = rede;
        this.impressora = impressora;
        this.video = video;
    }
    // Executa testes de todos os dispositivos
    public void executaTeste() {
        System.out.println("Executando teste...");
        System.out.println("Rede " + rede.executaTeste());
        System.out.println("Impressora " + impressora.executaTeste());
        System.out.println("Vídeo " + video.executaTeste());
        System.out.println("Teste concluído");
    }
    // Liga dispositivo
    public void ligarRede() {
        rede.ligaDispositivo();
    }
    // Liga dispositivo
    public void ligarImpressora() {
        impressora.ligaDispositivo();
    }

    // Liga dispositivo
    public void ligarVideo() {
        video.ligaDispositivo();
    }

}