package Controls;

import Model.Element;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class LoadElementFromFile {
    public static Element loadElement() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            try {
                FileInputStream fileInput = new FileInputStream(file);
                GZIPInputStream descompactador = new GZIPInputStream(fileInput);
                ObjectInputStream objectInput = new ObjectInputStream(descompactador);
                Object obj = objectInput.readObject();
                objectInput.close();
                return (Element) obj;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
