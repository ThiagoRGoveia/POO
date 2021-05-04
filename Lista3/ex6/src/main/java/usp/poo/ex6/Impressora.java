package usp.poo.ex6;

public class Impressora extends Driver {
    private String status;

    Impressora () {
        this.status = "Desligado";
    }

    public void ligar() {
        System.out.println("Ligando");
        status = "Ligado";
    }
    public void desligar() {
        System.out.println("Desligando");
        status = "Desligado";
    }
    public String checarStatus () {
        return status;
    }
    public boolean calibrar () {
        System.out.println("Calibrando");
        return true;
    }
    public void atualizarDriver() {
        System.out.println("Atualizando Driver");
    }
}
