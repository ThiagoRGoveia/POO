package usp.poo.lista1.ex2;

/*
 * Classe que define dispositivo Impressora que extende Drivers
 */
public class Impressora extends Drivers{
    // Construtor inicia contrutor de Drivers com o status inicial
    Impressora () {
       super("Desligado");
    }
    // Modifica status e imprime o texto em n páginas
    public void imprimePáginas (String texto, int numPáginas) {
        setStatus("Imprimindo");
        System.out.println("Imprimindo " + texto + " em " + numPáginas + " páginas");
        setStatus("Ligado");
    }
}
