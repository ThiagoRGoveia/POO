package usp.poo.ex5;

import java.util.zip.GZIPInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ler {
    public static void main(String[] args) {
        DadosPessoais dados;

        File file = new File("data.dat");
        try {
            FileInputStream fileInput = new FileInputStream(file);
            GZIPInputStream descompactador = new GZIPInputStream(fileInput);
            ObjectInputStream objectInput = new ObjectInputStream(descompactador);
            dados = (DadosPessoais) objectInput.readObject();
            System.out.println(dados);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
