package usp.poo.ex6;

public class Video implements Dispositivo {
    private String status;

    Video () {
        status = "Desligado";
    }
    public void ligar() {
        System.out.println("Ligando video");
    }
    public void desligar() {
        System.out.println("Desligando video");
    }
    public String checarStatus () {
        System.out.println("Status: pronto");
        return status;
    }
    public boolean calibrar () {
        System.out.println("Calibrando brilho");
        System.out.println("Calibrando contraste");
        System.out.println("Video calibrado");
        return true;
    }
    public void atualizarDriver() {
        System.out.println("Atualizando driver");
    }
}
