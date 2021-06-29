package usp.poo.ex6;

public class MeusVetores {
    private Integer[] a;
    private Integer[] b;

    public MeusVetores (Integer[] a, Integer[] b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A: [");
        for (Integer numero : a) {
            stringBuilder.append(numero).append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);
        stringBuilder.append("]\nB: [");
        for (Integer numero : b) {
            stringBuilder.append(numero).append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void calcular(Calculador calculator) {
        System.out.println(this);
        calculator.calcular(a, b);
    }
}

