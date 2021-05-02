package usp.poo.ex8;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<TimeFutebol> times = new ArrayList<TimeFutebol>();

        // times.add(
        //     new TimeFutebol(numeroDeVitorias, numeroDeDerrotas, numeroDeEmpates, golsSofridos, golsMarcados, cartoesVermelhos, cartoesAmarelos)
        // )

        times.add(
            new TimeFutebol("Botafogo", 2, 9, 9, 10, 5, 0, 1) // Menos pontos
        );

        times.add(
            new TimeFutebol("Ferroviária", 18, 1, 1, 10, 50, 2, 18) // Mais pontos
        );

        times.add(
            new TimeFutebol("Ponte Preta", 10, 8, 2, 10, 15, 0, 1) // Mais vitórias
        );

        times.add(
            new TimeFutebol("São Bento", 8, 4, 8, 5, 19, 8, 20) // Maior saldo de gols
        );

        times.add(
            new TimeFutebol("Bragantino", 8, 4, 8, 17, 30, 5, 10) // Mais Gols marcados
        );

        times.add(
            new TimeFutebol("Guarani", 8, 4, 8, 16, 29, 0, 3) // Menos cartões vermelhos
        );

        times.add(
            new TimeFutebol("Ituano", 8, 4, 8, 16, 29, 1, 1) //  Menos cartões Amarelos
        );

        times.add(
            new TimeFutebol("Mirassol", 8, 4, 8, 16, 29, 1, 2) // Sorteio
        );

        times.add(
            new TimeFutebol("Palmeiras", 8, 4, 8, 16, 29, 1, 2) // Sorteio
        );

        Collections.sort(times);

        System.out.format(
            "%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n",
            "Nome",
            "Pontos",
            "Vitorias",
            "Derrotas",
            "Empates",
            "Saldo",
            "G. Marcados",
            "G .Sofridos",
            "C. Vermelhos",
            "C. Amarelos"
        );
        for (TimeFutebol time: times) {
            System.out.println(time);
        }
    }
}
