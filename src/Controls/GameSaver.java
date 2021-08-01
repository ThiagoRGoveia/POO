package Controls;

import java.util.zip.GZIPOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GameSaver implements Serializable {

    private GameState gameState;

    public GameSaver(GameState gameState) {
        this.gameState = gameState;
    }

    public void save(String fileName) {
        saveObject(gameState, fileName);
        System.out.println("Game saved.");
    }

    public void save() {
        saveObject(gameState, createFileName());
        System.out.println("Game saved.");
    }

    public synchronized void saveObject(Serializable o, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fileOutput = new FileOutputStream(file);
            GZIPOutputStream compactador = new GZIPOutputStream(fileOutput);
            ObjectOutputStream objOutput = new ObjectOutputStream(compactador);
            objOutput.writeObject(o);
            objOutput.flush();
            objOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String createFileName() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        return "save-" +formattedDate + ".dat";
    }
}
