package usp.poo.ex8;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        MeuLineNumberReader meuLineNumberReader = new MeuLineNumberReader(
            new File("input.txt")
        );
        System.out.println(meuLineNumberReader.readLine());
        System.out.println(meuLineNumberReader.readLine());
        System.out.println(meuLineNumberReader.readLine());
        System.out.println(meuLineNumberReader.readLine());
    }

}
