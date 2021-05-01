package usp.poo.ex3;

public class Escola extends Predio{
    private String nome;
    Escola (int numeroDeAndares, int numeroDeApartamentosPorAndar, int numeroDeVagasDeGaragem, String nome) {
        super (numeroDeAndares,numeroDeApartamentosPorAndar,numeroDeVagasDeGaragem);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNomeDaEntidade() {
        return "Escola";
    }

}
