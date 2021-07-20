package usp.poo.ex5;

import java.util.zip.GZIPInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ler {
    public static void main(String[] args) {
        DadosPessoais dados;

        File file = new File("dados1.dat");
        try {
            FileInputStream fileInput = new FileInputStream(file);
            GZIPInputStream descompactador = new GZIPInputStream(fileInput);
            ObjectInputStream objectInput = new ObjectInputStream(descompactador);
            dados = (DadosPessoais) objectInput.readObject();
            System.out.println(dados.getEndereço().getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private  static void p(EndereçoA a) {
        System.out.println("A" + a.getClass());
    }
}
