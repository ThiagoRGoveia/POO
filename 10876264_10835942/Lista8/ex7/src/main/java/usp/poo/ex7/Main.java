package usp.poo.ex7;

public class Main {
    public static void main(String[] args) {
        Divida divida = new Divida(1000, 0.2);

        (new JurosDecorator(divida)).calcular();
        (new JurosComDescontoDecorator(divida, 0.1)).calcular();
        (new JurosComAcrescimoDecorator(divida, 0.1)).calcular();
    }
}
