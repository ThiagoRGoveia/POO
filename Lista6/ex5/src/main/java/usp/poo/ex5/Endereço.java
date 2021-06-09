package usp.poo.ex5;

import java.io.Serializable;

public class Endereço implements Serializable  {
    private String rua;
    private int número;

    public Endereço(String rua, int número) {
        this.rua = rua;
        this.número = número;
    }

    public String getRua() {
        return rua;
    }
    public int getNúmero() {
        return número;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setNúmero(int número) {
        this.número = número;
    }

    public String toString() {
        return String.format("%s %d", rua, número);
    }
}
