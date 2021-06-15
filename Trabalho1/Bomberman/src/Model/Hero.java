package Model;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import Tools.Events.EventBus;
import Tools.Position.Column;
import Tools.Position.Coordinate;
import Tools.Position.Position;
import Tools.Position.Row;
import Tools.Image.Animator;
import Tools.Image.LoadImage;
import Tools.Image.Boundaries.Boundaries;
public class Hero extends MovableElement {
    public Hero(EventBus eventBus, Position position) {
        super(
            eventBus,
            position
        );
        this.setTraversable(true);
    }

    public Hero(EventBus eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public void resetToLastPosition(){
        this.position.reset();
    }

    public void placeBomb() {
        Bomb bomb = new Bomb(
            this.eventBus,
            5,
            new Position(
                new Row(
                    new Coordinate(
                        this.position.getRow().getCoordinate().value
                    )
                ),
                new Column(
                    new Coordinate(
                        this.position.getColumn().getCoordinate().value
                    )
                )
            )
        );

        this.eventBus.emit("create-element", bomb);
    }

    public void interact(Hero hero) {}

    public void interact(Enemy enemy) {}

    public void interact(Explosion explosion) {}

    public void die() {}

    public void pickup(){}

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
