package Controls;

import Model.Element;
import Model.Hero;
import Model.Blocks.RegularBlock;
import Model.Enemies.BasicEnemy;
import Model.Enemies.Enemy;
import Tools.*;
import Tools.Events.*;
import Tools.Image.Animator;
import Tools.Image.AnimatorFactory;
import Tools.Image.ImageFactory;
import Tools.Image.Boundaries.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;

import Controls.KeyStrokes.Movements;

public class Screen extends javax.swing.JFrame implements MouseListener, KeyListener {
    public Drawer drawer;
    private EventBus<Element> eventBus;
    private Hero hero;
    private ArrayList<Element> elements;
    private ArrayList<Enemy> enemies;
    private Controller controller = new Controller(this);
    private Graphics graphics;
    private Movements movements;
    private InteractionMap interactionMap;
    private AnimatorFactory animatorFactory;
    private Timer timer;

    public Screen(Drawer drawer) {
        timer = new Timer();
        this.drawer = drawer;
        drawer.setScreen(this);

        this.addMouseListener(this); /*mouse*/
        this.addKeyListener(this);  /*teclado*/

        this.setSize(
            (
                (Consts.RES * Consts.CELL_SIDE) +
                (getInsets().left + getInsets().right)
            ),
            (
                (Consts.RES * Consts.CELL_SIDE) +
                (getInsets().top +  getInsets().bottom) + 30
            )
        );

        eventBus = new EventBus<Element>(this, 13);
        eventBus.on("create-element", new CreateElementsEvent());
        eventBus.on("remove-element", new RemoveElementsEvent());
        eventBus.on("create-explosion", new CreateExplosionEvent());
        eventBus.on("create-animator", new CreateAnimatorEvent());
        eventBus.on("create-schedule", new CreateScheduleEvent());
        eventBus.on("create-schedule-loop", new CreateScheduleEventLoop());
        eventBus.on("verify-element-interaction", new VerifyElementInteractionEvent());
        eventBus.on("insert-element-to-map", new InsertToInteractionMapEvent());
        eventBus.on("remove-element-from-map", new RemoveFromInteractionMapEvent());
        eventBus.on("move-element-on-map", new MoveOnInteractionMap());
        eventBus.on("game-over", new GameOverEvent());
        eventBus.on("monster-kill", new MonsterKillEvent());
        eventBus.on("create-enemy", new CreateEnemyEvent());

        elements = new ArrayList<Element>(100);
        elements = new ArrayList<Element>(10);

        hero = new Hero(eventBus, 0, 0, timer);
        this.addElement(hero);

        movements = new Movements();
        interactionMap= new InteractionMap();
        animatorFactory = new AnimatorFactory(
            new ImageFactory(
                new BoundariesFactoryLevel1()
            ),
            timer
        );
        Enemy enemy = new BasicEnemy(eventBus, 5, 5);
        this.addElement(enemy);
        enemy = new BasicEnemy(eventBus, 7, 7);
        this.addElement(enemy);
        enemy = new BasicEnemy(eventBus, 12, 12);
        this.addElement(enemy);
        enemy = new BasicEnemy(eventBus, 6, 20);
        this.addElement(enemy);

        RegularBlock block = new RegularBlock(eventBus, 2, 2);
        this.addElement(block);
        block = new RegularBlock(eventBus, 2, 2);
        this.addElement(block);
        block = new RegularBlock(eventBus, 2, 3);
        this.addElement(block);
        block = new RegularBlock(eventBus, 2, 4);
        this.addElement(block);
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }

    public Graphics getGraphicsBuffer(){
        return graphics;
    }

    public InteractionMap getInteractionMap() {
        return interactionMap;
    }

    public EventBus<Element>getEventBus() {
        return eventBus;
    }

    public Timer getTimer() {
        return timer;
    }

    public Animator getAnimator(String animatorName) {
        return animatorFactory.getAnimator(animatorName);
    }

    public void gameOver() {
        System.out.println("GAME OVER");
    }

    public void nextLevel() {

    }

    public void victory() {
        System.out.println("CONGRATULATIONS YOU WON");
    }

    public void recordMonsterKill() {
        System.out.println("MonsterKill"); // Controlar se a fase acabou aqui
    }

    /*Este metodo eh executado a cada Consts.FRAME_INTERVAL milissegundos*/
    public void paint(Graphics oldGraphics) {
        Graphics newGraphics = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        graphics = newGraphics.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);

        /*Desenha cenário*/
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                try {
                    /*Linha para alterar o background*/
                    Image newImage = Toolkit.getDefaultToolkit().getImage(
                        new java.io.File(".").getCanonicalPath() + Consts.PATH + "ground_1.png"
                    );
                    graphics.drawImage(
                        newImage,
                        j * Consts.CELL_SIDE,
                        i * Consts.CELL_SIDE,
                        Consts.CELL_SIDE,
                        Consts.CELL_SIDE,
                        null
                    );

                } catch (IOException ex) {
                    Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        /*Aqui podem ser inseridos novos processamentos de controle*/
        if (!this.elements.isEmpty()) {
            this.controller.draw(elements);
            this.controller.process(hero);
        }

        newGraphics.dispose();
        graphics.dispose();
        if (!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        }
    }

    public void go() {
        TimerTask redesenhar = new TimerTask() {
            public void run() {
                repaint(); /*(executa o metodo paint)*/
            }
        };

        /*Redesenha (executa o metodo paint) tudo a cada Consts.FRAME_INTERVAL milissegundos*/
        timer.schedule(redesenhar, 0, Consts.FRAME_INTERVAL);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initElements
    private void initElements() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POO2021");
        setAutoRequestFocus(false);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initElements
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        hero.stop(e.getKeyCode());
    }

    public void keyPressed(KeyEvent e) {
        movements.makeMovement(e, hero);

        if (!controller.isPositionValid(this.elements, hero)) {
            hero.resetToLastPosition();
        }
    }

}
