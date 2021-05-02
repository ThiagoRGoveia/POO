package usp.poo.ex8;

public class SaldoDeGols implements Comparable<SaldoDeGols> {
    public int saldo;

    SaldoDeGols (int saldo) {
        this.saldo = saldo;
    }

    public int compareTo(SaldoDeGols o) {
        if (saldo < o.saldo) {
            return 1;
        } else if (saldo > o.saldo) {
            return -1;
        } else {
            return 0;
        }
    }
}
