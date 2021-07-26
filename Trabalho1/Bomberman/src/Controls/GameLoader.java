package Controls;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.zip.GZIPInputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class GameLoader implements Serializable {

    public static GameState load() throws Exception {
        try {
            GameState gameState = (GameState) GameLoader.loadObject();
            return gameState;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load Screen");
        }
    }

    public static GameState load(String fileName) throws Exception {
        try {
            GameState gameState = (GameState) GameLoader.loadObject(fileName);
            return gameState;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load Screen");
        }
    }

    private static Object loadObject() throws Exception {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            return GameLoader.loadFile(file);
        } else {
            return null;
        }
    }

    private static Object loadObject(String fileName) throws Exception {
        File file = new File(fileName);
        return GameLoader.loadFile(file);
    }

    private static Object loadFile(File file) throws Exception {
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
