package usp.poo.ex3;

public class Bicicleta implements PegadaDeCarbono {
    private String marca;

    Bicicleta (String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPegadaDeCarbono() {
        return 0.0;
    }
}
