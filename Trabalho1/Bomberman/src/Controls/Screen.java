package Controls;

import Model.Element;
import Model.Hero;
import Model.Teste;
import Model.Enemies.Helicopter;
import Tools.*;
import Tools.Events.*;
import Tools.Events.Event;
import Tools.Image.Animator;
import Tools.Image.AnimatorFactory;
import Tools.Image.ImageFactory;
import Tools.Image.Boundaries.BoundariesFactoryLevel1;
import Tools.Position.Position;

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
    private Controller controller = new Controller(this);
    private Graphics graphics;
    private Movements movements;
    private InteractionMap interactionMap;
    private AnimatorFactory animatorFactory;

    public Screen(Drawer drawer) {
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
                (getInsets().top +  getInsets().bottom)
            )
        );

        eventBus = new EventBus<Element>(this, 20);
        eventBus.on("create-element", new CreateElementsEvent());
        eventBus.on("remove-element", new RemoveElementsEvent());
        eventBus.on("create-explosion", new CreateExplosionEvent());
        eventBus.on("create-animator", new CreateAnimatorEvent());
        eventBus.on("schedule-task", new CreateAnimatorEvent());

        elements = new ArrayList<Element>(100);

        hero = new Hero(eventBus, 8, 8);
        this.addElement(hero);

        Helicopter enemy = new Helicopter(eventBus, 0, 0, false);
        this.addElement(enemy);

        movements = new Movements();
        interactionMap= new InteractionMap();
        animatorFactory = new AnimatorFactory(
            new ImageFactory(
                new BoundariesFactoryLevel1()
            )
        );

        Teste teste = new Teste(eventBus, 5, 5);
        interactionMap.insert(new Position(5,5), teste);
        this.addElement(teste);

    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }

    public Graphics getGraphicsBuffer(){
        return graphics;
    }

    public InteractionMap getInteractionMap() {
        return interactionMap;
    }

    public EventBus getEventBus() {
        return eventBus;
    }

    public Animator getAnimator(String animatorName) {
        return animatorFactory.getAnimator(animatorName);
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
        Timer timer = new Timer();
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
