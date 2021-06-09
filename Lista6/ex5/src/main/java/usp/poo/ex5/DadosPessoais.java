package usp.poo.ex5;

import java.io.Serializable;
import java.time.LocalDate;

public class DadosPessoais implements Serializable {
    private Endereço endereço;
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;

    public DadosPessoais(
        Endereço endereço,
        String nome,
        String cpf,
        LocalDate dataDeNascumento
    ) {
        this.endereço = endereço;
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascumento;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String toString() {
        return String.format(
            "Endereço: %s\nNome: %s\nCPF: %s\nData de Nascimento: %s",
            endereço.toString(),
            nome,
            cpf,
            dataDeNascimento.toString()
        );
    }


}
