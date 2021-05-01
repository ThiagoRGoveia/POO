package usp.poo.ex3;

public class Casa extends Predio{
    Casa (int numeroDeAndares, int numeroDeApartamentosPorAndar, int numeroDeVagasDeGaragem) {
       super (numeroDeAndares,numeroDeApartamentosPorAndar,numeroDeVagasDeGaragem);
    }

    @Override
    public String getNomeDaEntidade() {
        return "Casa";
    }
}
