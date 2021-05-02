package usp.poo.ex8;

public class GolsMarcados implements Comparable<GolsMarcados>{
    public int marcados;

    GolsMarcados (int marcados) {
        this.marcados = marcados;
    }

    public int compareTo(GolsMarcados o) {
        if (marcados < o.marcados) {
            return 1;
        } else if (marcados > o.marcados) {
            return -1;
        } else {
            return 0;
        }
    }
}
