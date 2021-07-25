package Controls;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.zip.GZIPInputStream;

public class GameLoader implements Serializable {

    public static GameState load(String fileName) throws Exception {
        try {
            GameState gameState = (GameState) GameLoader.loadObject(fileName);
            return gameState;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load Screen");
        }
    }

    private static Object loadObject(String fileName) throws Exception {
        File file = new File(fileName);
        try {
            FileInputStream fileInput = new FileInputStream(file);
            GZIPInputStream descompactador = new GZIPInputStream(fileInput);
            ObjectInputStream objectInput = new ObjectInputStream(descompactador);
            Object obj = objectInput.readObject();
            objectInput.close();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load object");
        }
    }
}
