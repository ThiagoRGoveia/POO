package usp.poo.ex6;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] b = {0, 2, 3, 4, 5, 6, 11, 9};

        MeusVetores meusVetores =  new MeusVetores(a, b);
        // a)
        // meusVetores.calcular(new CalculardorDeUniao());
        // meusVetores.calcular(new CalculadorDeInterseccao());
        // meusVetores.calcular(new CalculadorDeDiferenca());

        // b)
        try {
            meusVetores.calcular(CalculadorFactory.criarCalculador("uniao"));
            meusVetores.calcular(CalculadorFactory.criarCalculador("interserccao"));
            meusVetores.calcular(CalculadorFactory.criarCalculador("diferenca"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
