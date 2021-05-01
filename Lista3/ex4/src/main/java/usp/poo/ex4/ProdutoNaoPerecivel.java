package usp.poo.ex4;

public class ProdutoNaoPerecivel extends Produto {
    private int garantiaEmAnos;
    ProdutoNaoPerecivel(int código, double preçoUnitário, String descrição, int estoque, int garantiaEmAnos) {
        super(código, preçoUnitário, descrição, estoque);
        this.garantiaEmAnos = garantiaEmAnos;
    }

    public int getGarantiaEmAnos() {
        return garantiaEmAnos;
    }
}
