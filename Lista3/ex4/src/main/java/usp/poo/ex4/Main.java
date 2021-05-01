package usp.poo.ex4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProdutoNaoPerecivel produtoNãoPerecivel = new ProdutoNaoPerecivel(
            1,
            2.5,
            "Arroz",
            10,
            1
        );
        // Utiliza a classe LocalDate para criar mais facilmente um objeto contendo uma data.
        LocalDate dataDeValidadeProdutoPerecivel =  LocalDate.of(2021, 6, 5);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(
            2,
            0.8,
            "Pão",
            50,
            new MyDate(
                dataDeValidadeProdutoPerecivel.toEpochDay() * 24 * 3600 * 1000  // Utiliza localDate para obter a data em milisegundos, neccesária para instanciar Date
            )
        );
        LocalDate dataDeValidadeProdutoPerecivelEspecial =  LocalDate.of(2021, 6, 1);
        ProdutoPerecivelEspecial produtoPerecivelEspecial = new ProdutoPerecivelEspecial(
            3,
            0.8,
            "Pão",
            50,
            new MyDate(
                dataDeValidadeProdutoPerecivelEspecial.toEpochDay() * 24 * 3600 * 1000
            )
        );

        Estoque estoque = new Estoque();

        estoque.cadastrarProduto(produtoNãoPerecivel);
        estoque.cadastrarProduto(produtoPerecivel);
        estoque.cadastrarProduto(produtoPerecivelEspecial);

        System.out.println(estoque);
    }
}
