package usp.poo.ex5;

public class TesteValorDeposito {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(0, 500);
        float valor = 1000;
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());
        try {
            while (true) {
                contaCorrente.depositar(valor);
                System.out.println("Valor depositado: " + valor + ", Saldo: " + contaCorrente.getSaldo());
                valor -= 230;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Valor: " +valor);
        }

    }
}
