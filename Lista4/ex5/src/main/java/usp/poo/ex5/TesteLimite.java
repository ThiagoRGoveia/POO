package usp.poo.ex5;

public class TesteLimite {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(1000);
        contaCorrente.setCreditoLimite(2000);
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());
        try {
            while (true) {
                contaCorrente.sacar(500);
                System.out.println("Saldo: " + contaCorrente.getSaldo());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
