package usp.poo.ex6;

public class DriverDaImpressora extends Driver{
    private String status;

    DriverDaImpressora (String status) {
        this.status = status;
    }

    public void ligar() {
        System.out.println("Ligando");
    }
    public void desligar() {
        System.out.println("Desligando");
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
