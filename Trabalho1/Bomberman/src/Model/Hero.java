package Model;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import Model.Enemies.Enemy;

import Controls.SerializableTimerTask;
import java.awt.event.KeyEvent;

import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Position.Column;
import Tools.Position.Coordinate;
import Tools.Position.Position;
import Tools.Position.Row;
import Tools.Image.Animator;
import Tools.Image.LoadImage;
import Tools.Image.Boundaries.Boundaries;

// Esta classe define o herói do jogo
public final class Hero extends MovableElement {
    private Animator deathAnimator;
    private boolean isDead;
    private int maxNumberOfBombs = 1;
    private int numberOfBombsPlaced = 0;
    private int bombIntensity = 1;
    private int numberOfLives;

    public Hero(EventBus eventBus, Position position) {
        super(eventBus, position, 10);
        this.setTraversable(true);
        setDeathAnimator();
        isLocked = false;
        numberOfLives = 3;
    }

    public Hero(EventBus eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public void resetToLastPosition(){
        this.position.reset();
    }

    // Permite crirar uma bomba
    public void placeBomb() {
        if (this.numberOfBombsPlaced < this.maxNumberOfBombs) {
            Bomb bomb = new Bomb(
                this.eventBus,
                bombIntensity,
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
                ),
                this
            );
            this.eventBus.emit("create-element", bomb);
            this.incrementNumberOfBombsPlaced();
        }
    }

    public void interact(Hero hero) {}

    public void interact(Enemy enemy) {
        die();
    }

    public void interact(Explosion explosion) {
        die();
    }

    public void die() {
        if (!isDead && !isImmortal) { // Evitar morte quando ele está imortal ou já esta morto
            decrementNumberOfLives();
            if (numberOfLives == 0) {
                eventBus.emit("game-over", this); // Se o número de vidas zerar, game over
                return;
            }
            eventBus.emit("set-hero-lives", this);
            this.isLocked = true;
            this.isDead = true;
            this.activeAnimator.stop(); // Parar animação atual
            if (this.movementTimer != null) {
                this.movementTimer.cancel(); // Parar movimento atual se houver
            }
            this.activeAnimator = deathAnimator; // Ativar animação de morte
            this.activeAnimator.start();

            this.createScheduledTask( // Criar tarefa para reviver a posição dentro de dois segundos
                new Schedule(
                    // Programa respwan do heroi pra status parado na posição (1,1)
                    new SerializableTimerTask(){
                        public void run() {
                            position.setPosition(
                                new Position(
                                    new Row(
                                        new Coordinate(1)
                                    ),
                                    new Column(
                                        new Coordinate(1)
                                    )
                                )
                            );
                            isDead = false;
                            isImmortal = true;
                            isLocked = false;
                            activeAnimator.stop(); // Para animação
                            activeAnimator.reset(); // Reinicia animação
                            movementDirection="down";
                            setStopedAnimator();
                            movementDirection="stoped";
                        }
                    },
                    2000
                )
            );
            this.eventBus.emit("create-schedule", this);
            // O heroi deve permanecer imortal por 5 segundos
            this.createScheduledTask(
                new Schedule(
                    new SerializableTimerTask(){
                        public void run() {
                            isImmortal = false;
                        }
                    },
                    7000
                )
            );
            this.eventBus.emit("create-schedule", this);
        }
    }

    public void processMovement() {
        if (!isLocked) {
            if (!Position.isPositionOutOfBoundaries(this.nextPosition)) {
                this.eventBus.emit("verify-element-interaction", this);
                if (this.interactingElement != null && this.interactingElement != this) {
                    this.interactingElement.interact(this);
                    if (this.interactingElement.isTraversable()) {
                        this.position.setPosition(this.nextPosition);
                    }
                } else {
                    this.position.setPosition(this.nextPosition);
                }
            }
        }

    }

    public void stop(int key) {
        if (!isLocked) {
            if (
                (KeyEvent.VK_UP == key && this.movementDirection == "up") ||
                (KeyEvent.VK_DOWN == key && this.movementDirection == "down") ||
                (KeyEvent.VK_LEFT == key && this.movementDirection == "left") ||
                (KeyEvent.VK_RIGHT == key && this.movementDirection == "right")
            ){
                this.activeAnimator.stop();
                this.movementTimer.cancel();
            }
            if (
                KeyEvent.VK_UP == key ||
                KeyEvent.VK_DOWN == key ||
                KeyEvent.VK_LEFT == key ||
                KeyEvent.VK_RIGHT == key
            ) {
                keysDown--;
            }
            if (keysDown <= 0) {
                keysDown = 0;
                this.setStopedAnimator();
                movementDirection = "stoped";
            }
        }
    }

    // Cria animações de movimento

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
        Animator animator;
        if (this.movementDirection == "right") {
            animator = stopedAnimatorList.get(3);
        }
        else if (this.movementDirection == "left") {
            animator = stopedAnimatorList.get(2);
        }
        else if (this.movementDirection == "up") {
            animator = stopedAnimatorList.get(1);
        }
        else {
            animator = stopedAnimatorList.get(0);
        }
        this.activeAnimator = animator;
    }
    // Popula as imagens usadas quando ele está parado
    public void setStopedAnimatorList() {
        stopedAnimatorList = new ArrayList<Animator>(4);
        stopedAnimatorList.add(new Animator(LoadImage.loadImageFromFile("heros.png", new Boundaries(71, 45, 16, 24)))); // DOWN
        stopedAnimatorList.add(new Animator(LoadImage.loadImageFromFile("heros.png", new Boundaries(73, 20, 16, 24)))); // UP
        stopedAnimatorList.add(new Animator(LoadImage.loadImageFromFile("heros.png", new Boundaries(3, 45, 16, 24)))); // LEFT
        stopedAnimatorList.add(new Animator(LoadImage.loadImageFromFile("heros.png", new Boundaries(106, 47, 16, 24)))); // RIGHT
    }

    // Cria animação de morte
    public void setDeathAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(6);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(30, 75, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(48, 75, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(66, 75, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(82, 75, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(99, 75, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(117, 75, 16, 24)));
        this.deathAnimator = new Animator(false, 100, images);
    }

    public void incrementMaxNumberOfBombs() {
        this.maxNumberOfBombs++;
    }

    public void decrementMaxNumberOfBombs() {
        this.maxNumberOfBombs--;
    }

    public void incrementNumberOfBombsPlaced() {
        this.numberOfBombsPlaced++;
    }

    public void decrementNumberOfBombsPlaced() {
        this.numberOfBombsPlaced--;
    }

    public void incrementBombIntensity() {
        this.bombIntensity++;
    }

    public void decrementBombIntensity() {
        this.bombIntensity--;
    }

    public void incrementNumberOfLives() {
        this.numberOfLives++;
        eventBus.emit("set-hero-lives", this);
    }

    public void decrementNumberOfLives() {
        this.numberOfLives--;
    }

    // A velocidade na verdade é o intervalo em que o método
    // move é chamado, então para aumentar a velocidade,
    // diminuímos o intervalo
    public void increaseSpeed() {
        if (this.speed > 2) {
            this.speed -= 2;
        }
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }


}
