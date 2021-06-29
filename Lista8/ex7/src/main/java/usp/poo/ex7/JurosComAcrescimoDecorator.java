package usp.poo.ex7;

public class JurosComAcrescimoDecorator extends DividaDecorator {
    private double acrescimo;

    public JurosComAcrescimoDecorator(Divida divida, double acrescimo) {
        super(divida, "com acréscimo");
        this.acrescimo = acrescimo;
    }

    public void calcular() {
        super.calcular();
        divida.calcular(acrescimo);
        System.out.println("Valor: " + divida.getValor());
    }
}

