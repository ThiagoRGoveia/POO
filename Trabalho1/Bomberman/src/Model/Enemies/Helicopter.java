package Model.Enemies;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.LoadImage;
import Tools.Image.Boundaries.Boundaries;
import Tools.Position.Position;

public class Helicopter extends Enemy {
    protected Helicopter(EventBus eventBus, Position position, boolean isVertical) {
        super(eventBus, position);
        if (isVertical) {
            this.moveUp();
        } else {
            this.moveLeft();
        }
    }

    public Helicopter(EventBus eventBus, int row, int column, boolean isVertical) {
        this(eventBus, new Position(row, column), isVertical);
    }

    public void setDownAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(56, 45, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(87, 45, 16, 24)));
        this.downAnimator = new Animator(true, 300, images);
    }

    public void setLeftAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(19, 45, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(35, 45, 16, 24)));
        this.leftAnimator = new Animator(true, 300, images);
    }

    public void setRightAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(122, 47, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(138, 47, 16, 24)));
        this.rightAnimator = new Animator(true, 300, images);
    }

    public void setUpAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(57, 20, 16, 24)));

        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(89, 20, 16, 24)));
        this.upAnimator = new Animator(true, 300, images);
    }

    public void setStopedAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(71, 45, 16, 24)));
        this.stopedAnimator = new Animator(false, 10000, images);

        // images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(71, 45, 16, 24))); DOWN
        // images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(73, 20, 16, 24))); UP
        // images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(106, 47, 16, 24))); RIGHT
        // images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(3, 45, 16, 24))); LEFT

    }
}
