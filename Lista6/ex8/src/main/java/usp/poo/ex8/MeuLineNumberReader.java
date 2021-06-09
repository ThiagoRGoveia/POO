package usp.poo.ex8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MeuLineNumberReader {
    private BufferedReader bufferedReader;
    private int line;

    public MeuLineNumberReader(File file) {
        line = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            this.bufferedReader = bufferedReader;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readLine() {
        try {
            line++;
            return String.format("%04d: %s", line, bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
