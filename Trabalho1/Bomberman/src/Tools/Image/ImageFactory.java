package Tools.Image;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import Tools.Consts;
import Tools.Image.Boundaries.Boundaries;
import Tools.Image.Boundaries.BoundaryFactory;

public class ImageFactory {
    private BoundaryFactory boundaryFactory;
    private LinkedHashMap<String,ArrayList<ImageIcon>> imageMap;

    public ImageFactory(BoundaryFactory boundaryFactory) {
        this.boundaryFactory = boundaryFactory;
        imageMap = new LinkedHashMap<String,ArrayList<ImageIcon>>(12);
        imageMap.put("bomb", loadBombImages());
        imageMap.put("first-explosion", loadFirstExplosionImages());
        imageMap.put("horizontal-left-last-explosion", loadHoriziontalLeftLastExplosionImages());
        imageMap.put("horizontal-right-last-explosion", loadHorizontalRightLastExplosionImages());
        imageMap.put("vertical-up-last-explosion", loadVerticalUpLastExplosionImages());
        imageMap.put("vertical-down-last-explosion", loadVerticalDownLastExplosionImages());
        imageMap.put("horizontal-middle-explosion", loadHorizontalMiddleExplosionImages());
        imageMap.put("vertical-middle-explosion", loadVerticalMiddleExplosionImages());
        imageMap.put("enemy-vertical-up-movement", loadEnemyVerticalUpMovementBoundaries());
        imageMap.put("enemy-vertical-down-movement", loadEnemyVerticalDownMovementBoundaries());
        imageMap.put("enemy-horizontal-left-movement", loadEnemyHorizontalLeftMovementBoundaries());
        imageMap.put("enemy-horizontal-right-movement", loadEnemyHorizontalRightMovementBoundaries());
    }

    private ArrayList<ImageIcon> loadImages(
        String sourceImageName,
        int numberOfImages,
        Boundaries[] boundariesList
    ) {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(numberOfImages);
        for (Boundaries boundaries: boundariesList) {
            try {
                BufferedImage bigImg = ImageIO.read(new File(new java.io.File(".").getCanonicalPath() + Consts.PATH + sourceImageName));
                BufferedImage img = bigImg.getSubimage(
                    boundaries.x,
                    boundaries.y,
                    boundaries.width,
                    boundaries.height
                );

                BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
                Graphics g = bi.createGraphics();
                g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
                g.dispose();
                images.add(new ImageIcon(bi));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return images;
    }

    public ArrayList<ImageIcon> loadBombImages() {
        return loadImages(
            "all.png",
            3,
            boundaryFactory.getBombBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadFirstExplosionImages() {
        return loadImages(
            "all.png",
            5,
            boundaryFactory.getFirstExplosionBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadHoriziontalLeftLastExplosionImages() {
        return loadImages(
            "all.png",
            5,
            boundaryFactory.getHoriziontalLeftLastExplosionBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadHorizontalMiddleExplosionImages() {
        return loadImages(
            "all.png",
            5,
            boundaryFactory.getHorizontalMiddleExplosionsionBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadHorizontalRightLastExplosionImages() {
        return loadImages(
            "all.png",
            5,
            boundaryFactory.getHorizontalRightLastExplosionBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadVerticalDownLastExplosionImages() {
        return loadImages(
            "all.png",
            5,
            boundaryFactory.getVerticalDownLastExplosionsionBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadVerticalMiddleExplosionImages() {
        return loadImages(
            "all.png",
            5,
            boundaryFactory.getVerticalMiddleExplosionsionBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadVerticalUpLastExplosionImages() {
        return loadImages(
            "all.png",
            5,
            boundaryFactory.getVerticalUpLastExplosionsionBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadEnemyVerticalUpMovementBoundaries() {
        return loadImages(
            "enemies2.png",
            4,
            boundaryFactory.getEnemyVerticalUpMovementBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadEnemyVerticalDownMovementBoundaries() {
        return loadImages(
            "enemies2.png",
            4,
            boundaryFactory.getEnemyVerticalDownMovementBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadEnemyHorizontalLeftMovementBoundaries() {
        return loadImages(
            "enemies2.png",
            4,
            boundaryFactory.getEnemyHorizontalLeftMovementBoundaries()
        );
    }

    public ArrayList<ImageIcon> loadEnemyHorizontalRightMovementBoundaries() {
        return loadImages(
            "enemies2.png",
            4,
            boundaryFactory.getEnemyHorizontalRightMovementBoundaries()
        );
    }

    public ArrayList<ImageIcon> getImageList(String name) {
        return imageMap.get(name);
    }

}
