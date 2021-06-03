package usp.poo.ex5;

public class ContaCorrente {
    private float saldo;
    private float creditoLimite;

    public ContaCorrente (float saldo, float creditoLimite) {
        this.saldo = saldo;
        this.creditoLimite = creditoLimite;
    }

    public ContaCorrente () {
        saldo = 0;
        creditoLimite = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getCreditoLimite() {
        return creditoLimite;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setCreditoLimite(float creditoLimite) {
        this.creditoLimite = creditoLimite;
    }

    public void sacar(float valor) throws LimiteAtingidoException{
        if (saldo + creditoLimite >= valor ) {
            saldo -= valor;
        } else {
            throw new LimiteAtingidoException();
        }
    }

    public void depositar(float valor) throws ValorDepositadoIvalidoException {
        if (valor >= 0) {
            saldo += valor;
        } else {
            throw new ValorDepositadoIvalidoException();
        }
    }
}
