package usp.poo.ex7;

public abstract class DividaDecorator {
    protected Divida divida;
    protected String tipo;

    public DividaDecorator(Divida divida, String tipo) {
        this.divida = divida;
        this.tipo = tipo;
    }

    public void calcular() {
        System.out.println("Calculando juros " + tipo);
    }
}
