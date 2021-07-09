package usp.poo.ex7;

public class JurosDecorator extends DividaDecorator {
    public JurosDecorator(Divida divida) {
        super(divida, "simples");
    }

    public void calcular() {
        super.calcular();
        divida.calcular();
        System.out.println("Valor: " + divida.getValor());
    }
}
