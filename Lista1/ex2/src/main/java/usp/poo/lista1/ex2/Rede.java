package usp.poo.lista1.ex2;
/*
 * Classe que define dispositivo Rede que herda de Drivers
 */
public class Rede extends Drivers {
    // Construtor inicia contrutor de Drivers com o status inicial
    Rede () {
        super("Desligado");
    }
    // Modifica status e envia pacotes de dados
    public void enviaPacoteDeDados (int dados) {
        setStatus("Enviando");
        System.out.println("Enviando pacote de dados: " + dados);
        setStatus("Enviado");
    }
}
