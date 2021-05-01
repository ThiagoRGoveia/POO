package usp.poo.ex4;


public class ProdutoPerecivel extends Produto {
    private MyDate validade;

    ProdutoPerecivel(int codigo, double preçoUnitario, String descriçao, int estoque, MyDate validade) {
        super(codigo, preçoUnitario, descriçao, estoque);
        this.validade = validade;
    }

    public int retirarDoEstoque(int quantidadeASerRetirada, MyDate hoje) {
        MyDate dataFutura = new MyDate(hoje);
        dataFutura.addDays(30);
        if (validade.after(dataFutura)) {
          return super.retirarDoEstoque(quantidadeASerRetirada);
        }
        return 0;
    }

    public boolean acrescentarAoEstoque(int quantidadeASerAcrescentada, MyDate validade) {
        if (getEstoque() == 0 || this.validade.equals(validade)) {
            super.acrescentarAoEstoque(quantidadeASerAcrescentada);
            return true;
        } else {
            return false;
        }
    }

    public MyDate getValidade() {
        return validade;
    }

}
