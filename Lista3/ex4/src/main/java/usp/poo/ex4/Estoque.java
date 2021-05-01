package usp.poo.ex4;

import java.util.ArrayList;

public class Estoque {
    public ArrayList<Produto> estoque;

    Estoque () {
        estoque = new ArrayList<Produto>();
    }

    public void cadastrarProduto (Produto produto) {
        estoque.add(produto);
    }

    public void removerProduto(int codigo) {
        int index = encontrarProdutoPorCodigo(codigo);
        if (index >= 0) {
            estoque.remove(index);
        }
    }

    private int encontrarProdutoPorCodigo (int codigo) {
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getCodigo() == codigo) {
                return i;
            }
        }
        System.out.println("Produto não encontrado");
        return -1;
    }

    public Produto consultarProduto(int codigo) {
        int index = encontrarProdutoPorCodigo(codigo);
        if (index >= 0) {
            return estoque.get(index);
        } else {
            return null;
        }
    }

    public double valorTotalDoEstoque () {
        double valorAcumulado = 0;
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            valorAcumulado += produto.getPreçoUnitario() * produto.getEstoque();
        }
        return valorAcumulado;
    }

    @Override
    public String toString() {
        String string = "Produtos cadastrados no estoque: " + estoque.size() + "\n";
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            string = string + produto.toString() + '\n';
        }
        return string;
    }

}
