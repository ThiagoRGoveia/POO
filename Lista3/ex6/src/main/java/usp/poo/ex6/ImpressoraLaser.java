package usp.poo.ex6;

public class ImpressoraLaser extends Impressora {
    private String status;

    ImpressoraLaser () {
        status = "Desligado";
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
        status = "Tonner em 80%";
        System.out.println("Calibrado");
        return true;
    }
    public void atualizarDriver() {
        System.out.println("Checando drivers");
        System.out.println("Atualizando driver");
        System.out.println("Atualizado");
    }
}
