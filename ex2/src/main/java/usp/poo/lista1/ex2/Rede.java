package usp.poo.lista1.ex2;

public class Rede extends Drivers {

    Rede () {
        super("Desligado");
    }

    public void enviaPacoteDeDados (int dados) {
        setStatus("Enviando");
        System.out.println("Enviando pacote de dados: " + dados);
        setStatus("Enviado");
    }
}
