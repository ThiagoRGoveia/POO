package usp.poo.ex5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Escrever {
    public static void main(String[] args) {
        DadosPessoais dados1 = new DadosPessoais(
            new EndereçoA("Rua dois", 3),
            "João da Silva",
            "123.456.789-00",
            LocalDate.of(2000, 10, 20)
        );

        DadosPessoais dados2 = new DadosPessoais(
            new EndereçoB("Rua dois", 3),
            "João da Silva",
            "123.456.789-00",
            LocalDate.of(2000, 10, 20)
        );

        DadosPessoais dados3 = new DadosPessoais(
            new Endereço("Rua dois", 3),
            "João da Silva",
            "123.456.789-00",
            LocalDate.of(2000, 10, 20)
        );

        ArrayList<DadosPessoais> dados = new ArrayList<>();
        dados.add(dados1);
        dados.add(dados2);
        dados.add(dados3);

        int counter = 0;
        for (DadosPessoais d : dados) {
            Escrever.escrever(d, String.format("dados%d.dat", counter++));
        }
    }

    private static void escrever(DadosPessoais dados, String name) {
        File file = new File(name);
        try {
            file.createNewFile();
            FileOutputStream fileOutput = new FileOutputStream(file);
            GZIPOutputStream compactador = new GZIPOutputStream(fileOutput);
            ObjectOutputStream objOutput = new ObjectOutputStream(compactador);
            objOutput.writeObject(dados);
            objOutput.flush();
            objOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
