package usp.poo.ex5;

import java.time.LocalDate;
import java.util.zip.GZIPOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Escrever {
    public static void main(String[] args) {
        DadosPessoais dados = new DadosPessoais(
            new Endereço("Rua dois", 3),
            "João da Silva",
            "123.456.789-00",
            LocalDate.of(2000, 10, 20)
        );

        File file = new File("data.dat");
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
