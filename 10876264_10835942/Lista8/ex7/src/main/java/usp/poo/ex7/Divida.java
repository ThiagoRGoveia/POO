package usp.poo.ex7;


public class Divida {
    private double valor;
    private double juros;

    public Divida(double valor, double juros) {
        this.valor = valor;
        this.juros = juros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void calcular(double modificadorDeJuros) {
        valor = valor * (1 + juros + modificadorDeJuros);
    }

    public void calcular() {
        valor = valor * (1 + juros);
    }
}
