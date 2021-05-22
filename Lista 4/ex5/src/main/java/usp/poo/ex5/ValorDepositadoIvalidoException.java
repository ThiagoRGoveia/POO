package usp.poo.ex5;

public class ValorDepositadoIvalidoException extends Exception{
    public ValorDepositadoIvalidoException() {
        super("Valor fornecido para depósito é invalido!");
    }
}
