package Controls;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

import Tools.Consts;

public class GameLoader {

    public Screen load() throws Exception {
        try {
            Screen screen = (Screen) loadObject(Consts.SAVE_FILE);
            return screen;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load Screen");
        }
    }

    public Object loadObject(String fileName) throws Exception {
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
