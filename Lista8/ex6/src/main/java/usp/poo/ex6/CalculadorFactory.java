package usp.poo.ex6;

public class CalculadorFactory {

    public static Calculador criarCalculador(String nome) throws Exception {
        if (nome == "uniao") {
            return new CalculardorDeUniao();
        } else if (nome == "interserccao") {
            return new CalculadorDeInterseccao();
        } else if (nome == "diferenca") {
            return new CalculadorDeDiferenca();
        }
        throw new Exception("Factory não encontrada");
    }
}
