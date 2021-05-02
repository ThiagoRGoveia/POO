package usp.poo.ex8;

public class Vitorias implements Comparable<Vitorias> {
    public int vitorias;

    Vitorias (int vitorias) {
        this.vitorias = vitorias;
    }

    public int compareTo(Vitorias o) {
        if (vitorias < o.vitorias) {
            return 1;
        } else if (vitorias > o.vitorias) {
            return -1;
        } else {
            return 0;
        }
    }
}
