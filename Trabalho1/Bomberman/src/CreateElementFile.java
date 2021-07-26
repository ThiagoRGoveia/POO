
import Controls.AnimatorSingleton;
import Model.Blocks.IndestructableBlock;
import Model.Blocks.RegularBlock;
import Model.Enemies.BasicEnemy;
import Tools.Image.ImageFactory;
import Tools.Image.Boundaries.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;
import java.io.File;
public class CreateElementFile {

    public static void main(String[] args) {

        AnimatorSingleton.getInstance();
        for (int i = 1; i <= 4; i++) {
            AnimatorSingleton.setImageFactory(CreateElementFile.getImageFactory(i));
            saveObject(
                new RegularBlock(0, 0),
                "regular_block_lv" + i + ".dat"
            );
            saveObject(
                new IndestructableBlock(0, 0),
                "indestructable_block_lv" + i + ".dat"
            );
            saveObject(
                new BasicEnemy(0, 0),
                "basic_enemy_lv" + i + ".dat"
            );
        }
        System.exit(0);
    }

    private static ImageFactory getImageFactory(int level) {
        switch (level) {
            case 1:
                return getImageFactoryLevel1();
            case 2:
                return getImageFactoryLevel2();
            case 3:
                return getImageFactoryLevel3();
            case 4:
                return getImageFactoryLevel4();
        }
        return null;
    }

    private static ImageFactory getImageFactoryLevel1() {
        return new ImageFactory(
            new BoundariesFactoryLevel1()
        );
    }

    private static ImageFactory getImageFactoryLevel2() {
        return new ImageFactory(
            new BoundariesFactoryLevel2()
        );
    }

    private static ImageFactory getImageFactoryLevel3() {
        return new ImageFactory(
            new BoundariesFactoryLevel3()
        );
    }

    private static ImageFactory getImageFactoryLevel4() {
        return new ImageFactory(
            new BoundariesFactoryLevel4()
        );
    }

    public static void saveObject(Serializable o, String fileName) {
        File file = new File("savedObjects/" + fileName);
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
