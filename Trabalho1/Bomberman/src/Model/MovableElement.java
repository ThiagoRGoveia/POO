package Model;


import javax.swing.ImageIcon;
import java.util.ArrayList;
import Controls.SerializableTimerTask;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Position.Position;

public abstract class MovableElement extends AnimatedElement {
    protected String movementDirection;
    protected Animator leftAnimator;
    protected Animator rightAnimator;
    protected Animator upAnimator;
    protected Animator downAnimator;
    protected Animator activeAnimator;
    protected ArrayList<Animator> stopedAnimatorList;
    protected SerializableTimerTask movementTimer;
    protected int keysDown;
    protected Element interactingElement;
    protected Position nextPosition;
    protected int speed;
    protected boolean isLocked;


    protected MovableElement(Position position, int speed) {
        super(position);
        this.keysDown = 0;
        setDownAnimator(); // Chama cada um dos animadores
        setLeftAnimator();
        setRightAnimator();
        setUpAnimator();
        setStopedAnimatorList();
        this.activeAnimator = this.stopedAnimatorList.get(0); // O animador padrão é o primeiro da lista (olhando para baixo)
        activeAnimator.start();
        this.speed = speed;
        isLocked = false;
    }

    public abstract void setDownAnimator();
    public abstract void setLeftAnimator();
    public abstract void setRightAnimator();
    public abstract void setUpAnimator();
    public abstract void setStopedAnimatorList();
    public abstract void processMovement();

    public ImageIcon getImage() {
        return activeAnimator.getImage();
    }

    // Programa  movimento na thread principal do jogo
    public void move(int speed) {
        this.createScheduledTask(
                new Schedule(this.movementTimer, 0, speed)
            );
        EventBus.getInstance().emit("create-schedule-loop", this);
    }

    // Metodo utilizado para informar ao objeto qual elemento interagirá com ele
    public void setInteractingElement(Element interactingElement) {
        this.interactingElement = interactingElement;
    }

    public Element getInteractingElement() {
        return interactingElement;
    }

    public void setNextPosition(Position nextPosition) {
        this.nextPosition = nextPosition;
    }

    public Position getNextPosition() {
        return nextPosition;
    }

    // Quando houver mudança de direção, programe movimento apropriado
    public void moveUp() {
        if (movementDirection != "up" && !isLocked) {
            changeAnimatorAndKillMovement(upAnimator, "up");
            this.movementTimer = new SerializableTimerTask() {
                public void run() {
                    nextPosition = position.getMovementUp();
                    processMovement();
                }
            };
            this.move(this.speed);
        }
    }

    public void moveDown() {
        if (movementDirection != "down" && !isLocked) {
            changeAnimatorAndKillMovement(downAnimator, "down");
            this.movementTimer = new SerializableTimerTask() {
                public void run() {
                    nextPosition = position.getMovementDown();
                    processMovement();
                }
            };
            this.move(this.speed);
        }
    }

    public void moveRight() {
        if (movementDirection != "right" && !isLocked) {
            changeAnimatorAndKillMovement(rightAnimator, "right");
            this.movementTimer = new SerializableTimerTask() {
                public void run() {
                    nextPosition = position.getMovementRight();
                    processMovement();
                }
            };
            this.move(this.speed);
        }
    }

    public void moveLeft() {
        if (movementDirection != "left" && !isLocked) {
            changeAnimatorAndKillMovement(leftAnimator, "left");
            movementTimer = new SerializableTimerTask() {
                public void run() {
                    nextPosition = position.getMovementLeft();
                    processMovement();
                }
            };
            this.move(this.speed);
        }
    }
    // Muda animador e para movimento antes da troca de direção
    public void changeAnimatorAndKillMovement(Animator animator, String direction) {
        keysDown++;
        this.movementDirection = direction;
        this.activeAnimator.stop();
        this.activeAnimator = animator;
        activeAnimator.start();
        if (this.movementTimer != null) {
            this.movementTimer.cancel();
        }
    }
    // Seta animador de estado parado dependendo da direção
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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMovementDirection() {
        return movementDirection;
    }

    public void start() {
       activeAnimator.start();

    }

}
