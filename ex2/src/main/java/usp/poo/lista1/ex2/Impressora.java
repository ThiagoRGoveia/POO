package usp.poo.lista1.ex2;

public class Impressora extends Drivers{

    Impressora () {
       super("Desligado");
    }

    public void imprimePáginas (String texto, int numPáginas) {
        setStatus("Imprimindo");
        System.out.println("Imprimindo " + texto + " em " + numPáginas + " páginas");
        setStatus("Ligado");
    }
}
