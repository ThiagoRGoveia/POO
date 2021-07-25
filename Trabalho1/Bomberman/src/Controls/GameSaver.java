package Controls;

import java.util.zip.GZIPOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GameSaver implements Serializable {

    private GameState gameState;

    public GameSaver(GameState gameState) {
        this.gameState = gameState;
    }

    public void save() {
        saveObject(gameState);
        System.out.println("Game saved.");
    }

    public synchronized void saveObject(Serializable o) {
        File file = new File("data.dat");
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
}
