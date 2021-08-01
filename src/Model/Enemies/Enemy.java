package Model.Enemies;

import Controls.SerializableTimerTask;

import Model.Explosion;
import Model.Hero;
import Model.MovableElement;
import Tools.RandomSingleton;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esta classe define o comportametno dos inimigos
public abstract class Enemy extends MovableElement {
    private boolean isDead = false;
    protected static String[] directions = {"up", "down", "right", "left"}; // Direções disponíveis

    protected Enemy(Position position) {
        super(position, 35);
    }

    public void interact(Hero hero) { // Se interagir com um heroi, mate ele
        hero.die();
    }

    public void interact(Enemy enemy) { // Se interagir com outro inimigo, mode de direção
        enemy.changeDirection();
    }

    public void interact(Explosion explosion) { // Se interagir com uma explosão morra
        die();
    }

    public void processMovement() {
        if (!Position.isPositionByTheBoundaries(this.nextPosition) && !isDead) { // Mover se estiver dentro do mapa e não estiver morto
            EventBus.getInstance().emit("verify-element-interaction", this); // Verificar se proxima posição irá interagir com algum elemento
            if (this.interactingElement != null && this.interactingElement != this) { // Se houver um elemento na proxima posição, interagir com ele
                this.interactingElement.interact(this);
                if (this.interactingElement.isTraversable()) { // Se ele não for transponível mude de direção
                    this.updatePosition();
                } else {
                    this.changeDirection();
                }
            } else {
                this.updatePosition();
            }
        } else { // Se o mapa acabou mude de direção
            this.changeDirection();
        }
    }

    // A escolha da proxima direção é aleatória
    public void changeDirection() {
        int nextDirection = RandomSingleton.getInstance().nextInt(4);
        while (this.movementDirection == directions[nextDirection]) {
            nextDirection = RandomSingleton.getInstance().nextInt(4);
        }
        this.movementDirection = directions[nextDirection];
        makeMovement();
    }

    // Realiza o movimento baseado na direção
    protected void makeMovement() {
        if (this.movementDirection.equals("up")) {
            this.moveUp();
        } else if (this.movementDirection.equals("down")) {
            this.moveDown();
        } else if (this.movementDirection.equals("left")) {
            this.moveLeft();
        } else if (this.movementDirection.equals("right")) {
            this.moveRight();
        }
    }

    public void moveUp() {
        changeAnimatorAndKillMovement(upAnimator, "up");
        this.movementTimer = new SerializableTimerTask() {
            public void run() {
                nextPosition = position.getMovementUp();
                processMovement();
            }
        };
        this.move(this.speed);
    }

    public void moveDown() {
        changeAnimatorAndKillMovement(downAnimator, "down");
        this.movementTimer = new SerializableTimerTask() {
            public void run() {
                nextPosition = position.getMovementDown();
                processMovement();
            }
        };
        this.move(this.speed);
    }

    public void moveRight() {
        changeAnimatorAndKillMovement(rightAnimator, "right");
        this.movementTimer = new SerializableTimerTask() {
            public void run() {
                nextPosition = position.getMovementRight();
                processMovement();
            }
        };
        this.move(this.speed);
    }

    public void moveLeft() {
        changeAnimatorAndKillMovement(leftAnimator, "left");
        movementTimer = new SerializableTimerTask() {
            public void run() {
                nextPosition = position.getMovementLeft();
                processMovement();
            }
        };
        this.move(this.speed);
    }
    // Atualiza posição no mapa de interação
    public void updatePosition() {
        EventBus.getInstance().emit("move-element-on-map", this);
        this.position.setPosition(this.nextPosition);
    }

    public void die() {
        this.isDead = true;
        this.movementTimer.cancel();
        EventBus.getInstance().emit("remove-enemy", this);
    }

    // Para movimento
    public void stop() {
        this.movementTimer.cancel();
    }

    public void start() {
        this.makeMovement();
        super.start();
    }

}
