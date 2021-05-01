package usp.poo.ex4;

public class ProdutoPerecivelEspecial extends ProdutoPerecivel {
    ProdutoPerecivelEspecial(int código, double preçoUnitário, String descrição, int estoque, MyDate validade) {
        super(código, preçoUnitário, descrição, estoque, validade);
    }

    @Override
    public String toString() {

        return String.format("%s, validade %s", super.toString(), getValidade());
    }
}
