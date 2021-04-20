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

    }
}
