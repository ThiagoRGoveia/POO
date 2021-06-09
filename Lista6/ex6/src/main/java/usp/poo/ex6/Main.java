package usp.poo.ex6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        File read = new File("input.txt");
        File write = new File("output.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(read));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(write));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replace("muito", "pouco");
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
