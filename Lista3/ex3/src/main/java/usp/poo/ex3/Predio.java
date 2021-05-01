package usp.poo.ex3;

abstract class Predio implements PegadaDeCarbono {
    private int numeroDeAndares;
    private int numeroDeVagasDeGaragem;
    private int numeroDeApartamentosPorAndar;

    Predio (int numeroDeAndares, int numeroDeApartamentosPorAndar, int numeroDeVagasDeGaragem) {
        this.numeroDeAndares = numeroDeAndares;
        this.numeroDeApartamentosPorAndar = numeroDeApartamentosPorAndar;
        this.numeroDeVagasDeGaragem = numeroDeVagasDeGaragem;
    }

    public int getNumeroDeAndares() {
        return numeroDeAndares;
    }

    public int getNumeroDeApartamentosPorAndar() {
        return numeroDeApartamentosPorAndar;
    }

    public int getNumeroDeVagasDeGaragem() {
        return numeroDeVagasDeGaragem;
    }

    public void setNumeroDeAndares(int numeroDeAndares) {
        this.numeroDeAndares = numeroDeAndares;
    }

    public void setNumeroDeApartamentosPorAndar(int numeroDeApartamentosPorAndar) {
        this.numeroDeApartamentosPorAndar = numeroDeApartamentosPorAndar;
    }

    public void setNumeroDeVagasDeGaragem(int numeroDeVagasDeGaragem) {
        this.numeroDeVagasDeGaragem = numeroDeVagasDeGaragem;
    }

    @Override
    public double getPegadaDeCarbono() {
        return (numeroDeAndares * numeroDeApartamentosPorAndar) * 1.75;
    }

    public String getNomeDaEntidade () {
        return "Predio";
    }


}
