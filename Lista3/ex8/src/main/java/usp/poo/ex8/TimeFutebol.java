package usp.poo.ex8;

public class TimeFutebol implements Comparable<TimeFutebol> {
    public String nome;
    private Derrotas numeroDeDerrotas;
    private Empates numeroDeEmpates;
    private Vitorias numeroDeVitorias;
    private GolsSofridos golsSofridos;
    private GolsMarcados golsMarcados;
    private CartoesVermelhos cartoesVermelhos;
    private CartoesAmarelos cartoesAmarelos;
    private SaldoDeGols saldoDeGols;

    TimeFutebol (
        String nome,
        int numeroDeVitorias,
        int numeroDeDerrotas,
        int numeroDeEmpates,
        int golsSofridos,
        int golsMarcados,
        int cartoesVermelhos,
        int cartoesAmarelos
    ) {
        this.nome = nome;
        this.numeroDeVitorias = new Vitorias(numeroDeVitorias);
        this.numeroDeDerrotas = new Derrotas(numeroDeDerrotas);
        this.numeroDeEmpates = new Empates(numeroDeEmpates);
        this.golsSofridos = new GolsSofridos(golsSofridos);
        this.golsMarcados = new GolsMarcados(golsMarcados);
        this.cartoesVermelhos = new CartoesVermelhos(cartoesVermelhos);
        this.cartoesAmarelos = new CartoesAmarelos(cartoesAmarelos);
        this.saldoDeGols = new SaldoDeGols(
            golsMarcados - golsSofridos
        );
    }

    public void setDerrotas(int numeroDeDerrotas) {
        this.numeroDeDerrotas.derrotas = numeroDeDerrotas;
    }

    public void setEmpates(int empates) {
        this.numeroDeEmpates.empates = empates;
    }

    public void setVitorias(int vitorias) {
        this.numeroDeVitorias.vitorias = vitorias;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados.marcados = golsMarcados;
        setSaldoDeGols();
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos.sofridos = golsSofridos;
    }

    public void setCartoesVermelhos(int cartoesVermelhos) {
        this.cartoesVermelhos.cartoes = cartoesVermelhos;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos.cartoes = cartoesAmarelos;
    }

    private void setSaldoDeGols () {
        this.saldoDeGols.saldo = golsMarcados.marcados - golsSofridos.sofridos;
    }

    public int getDerrotas() {
        return numeroDeDerrotas.derrotas;
    }

    public int getEmpates() {
        return numeroDeEmpates.empates;
    }

    public int getVitorias() {
        return numeroDeVitorias.vitorias;
    }

    public int getGolsMarcados() {
        return golsMarcados.marcados;
    }

    public int getGolsSofridos() {
        return golsSofridos.sofridos;
    }

    public int getPontos () {
        return numeroDeVitorias.vitorias * 3 + numeroDeEmpates.empates;
    }

    public int getSaldoDeGols() {
        return saldoDeGols.saldo;
    }

    private int compararCriteriosDeDesempate (TimeFutebol o) {
        int comparacaoDoResultado = numeroDeVitorias.compareTo(o.numeroDeVitorias);
        if (comparacaoDoResultado == 0) {
            comparacaoDoResultado = saldoDeGols.compareTo(o.saldoDeGols);
            if (comparacaoDoResultado == 0) {
                comparacaoDoResultado = golsMarcados.compareTo(o.golsMarcados);
                if (comparacaoDoResultado == 0) {
                    comparacaoDoResultado = cartoesVermelhos.compareTo(o.cartoesVermelhos);
                        if (comparacaoDoResultado == 0) {
                            comparacaoDoResultado = cartoesAmarelos.compareTo(o.cartoesAmarelos);
                            if (comparacaoDoResultado == 0) {
                                comparacaoDoResultado = Math.random() > 0.5 ? 1 : -1;
                            }
                        }
                }
            }
        }
        return comparacaoDoResultado;
    }


    @Override
    public int compareTo(TimeFutebol o) {
        int pontosTimeComparado = o.getPontos();
        int pontos = getPontos();
        if (pontos < pontosTimeComparado) {
            return 1;
        }
        else if (pontos > pontosTimeComparado) {
            return -1;
        }
        else {
            return compararCriteriosDeDesempate(o);
        }

    }

    @Override
    public String toString() {
        return String.format(
            "%12s %12s %12d %12d %12d %12d %12d %12d %12d %12d",
            nome,
            getPontos(),
            numeroDeVitorias.vitorias,
            numeroDeDerrotas.derrotas,
            numeroDeEmpates.empates,
            getSaldoDeGols(),
            golsMarcados.marcados,
            golsSofridos.sofridos,
            cartoesVermelhos.cartoes,
            cartoesAmarelos.cartoes
        );
    }
}
