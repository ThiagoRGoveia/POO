package usp.poo.ex7;

public class JurosComDescontoDecorator extends DividaDecorator {
    private double desconto;

    public JurosComDescontoDecorator(Divida divida, double desconto) {
        super(divida, "com desconto");
        this.desconto = desconto;
    }

    public void calcular() {
        super.calcular();
        divida.calcular(-desconto);
        System.out.println("Valor: " + divida.getValor());
    }
}
