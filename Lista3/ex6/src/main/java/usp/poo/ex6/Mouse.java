package usp.poo.ex6;

public class Mouse implements Dispositivo {
    private String status;

    Mouse () {
        status = "Desligado";
    }
    public void ligar() {
        System.out.println("Ligando mouse");
    }
    public void desligar() {
        System.out.println("Desligando mouse");
    }
    public String checarStatus () {
        System.out.println("Status: pronto");
        return status;
    }
    public boolean calibrar () {
        System.out.println("Calibrando");
        status = "Calibrado";
        System.out.println("Calibrado");
        return true;
    }
    public void atualizarDriver() {
        System.out.println("Atualizando driver");
    }
}
