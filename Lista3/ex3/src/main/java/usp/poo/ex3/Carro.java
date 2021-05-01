package usp.poo.ex3;

public class Carro implements PegadaDeCarbono {
    private String modelo;
    private int ano;
    private double quilometragem;

    Carro (String modelo, int ano, double quilometragem) {
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public double getPegadaDeCarbono() {
        return quilometragem * 0.2;
    }

    public String getNomeDaEntidade () {
        return "Carro";
    }
}
