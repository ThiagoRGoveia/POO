package usp.poo.ex6;

public class ImpressoraJatoDeTinta extends Impressora {
    private String status;

    ImpressoraJatoDeTinta () {
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
        System.out.println("Calibrando cartuchos");
        status = "Cartuchos de tinta em: Preta 30%, Colorida: 50%";
        return true;
    }
    public void atualizarDriver() {
        System.out.println("Checando drivers");
        System.out.println("Atualizando driver");
        System.out.println("Atualizado");

    }
}
