package usp.poo.ex7;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o caminho para o diretório");;
        String path = input.nextLine();
        File folder = new File(path);
        ArrayList<FileWithSize> fileArray = new ArrayList<FileWithSize>();
        // Ler arquivos e inserir na arraylist
        for (final File file : folder.listFiles()) {
            String fileName = file.getName();
            if (fileName.endsWith(".mp3")) {
                fileArray.add(
                    new FileWithSize(
                        file,
                        file.length()
                    )
                );
            }
        }
        // Ordenar a lista de arquivos
        Collections.sort(fileArray);
        // Renomear arquivos
        for (FileWithSize fileWithSize : fileArray) {
            String[] fileNameArr = fileWithSize.file.getName().split("\\.");
            String number = String.format("%04d", fileArray.indexOf(fileWithSize) + 1) ; //Criar núemro com base na ordem
            fileWithSize.file.renameTo(
                new File(
                   path + "/" + number + "." +fileNameArr[0].replaceAll("[0-9]|-", "") + "." + fileNameArr[1]
                )
            );
        }
    }
}




