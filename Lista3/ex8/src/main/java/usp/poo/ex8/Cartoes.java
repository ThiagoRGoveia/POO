package usp.poo.ex8;

public class Cartoes implements Comparable<Cartoes> {
    public int cartoes;

    Cartoes (int cartoes) {
        this.cartoes = cartoes;
    }

    public int compareTo(Cartoes o) {
        if (cartoes > o.cartoes) {
            return 1;
        } else if (cartoes < o.cartoes) {
            return -1;
        } else {
            return 0;
        }
    }
}
