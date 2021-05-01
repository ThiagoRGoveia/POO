package usp.poo.ex4;

public abstract class Produto {
    private int codigo;
    private double preçoUnitario;
    private String descriçao;
    private int estoque;

    Produto (int codigo, double preçoUnitario, String descriçao, int estoque) {
        this.codigo = codigo;
        this.preçoUnitario = preçoUnitario;
        this.descriçao = descriçao;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreçoUnitario() {
        return preçoUnitario;
    }


    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }


    public void setpPeçoUnitario(double preçoUnitario) {
        this.preçoUnitario = preçoUnitario;
    }

    public int retirarDoEstoque (int quantidadeASerRetirada) {
        if (estoque - quantidadeASerRetirada  <= 0) {
            int quantidadeRetirada = estoque;
            estoque = 0;
            return quantidadeRetirada;
        } else {
            estoque -= quantidadeASerRetirada;
            return quantidadeASerRetirada;
        }
    }

    public int acrescentarAoEstoque(int quantidadeASerAcrescentada) {
        estoque += quantidadeASerAcrescentada;
        return estoque;
    }

    @Override
    public String toString() {
        return String.format("Produto %d, %s, custo de R$ %.2f, quantidade %d", codigo, descriçao, preçoUnitario, estoque);
    }


}
