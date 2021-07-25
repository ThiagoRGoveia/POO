package Controls;

import java.io.Serializable;
import java.util.ArrayList;

import Model.Element;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.InteractionMap;

public class GameState implements Serializable {
    private ArrayList<Element> elements;
    private ArrayList<Enemy> enemies;
    private LevelState levelState;
    private Hero hero;
    private InteractionMap interactionMap;
    private TimerSingleton timer;

    public TimerSingleton getTimer() {
        return timer;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public Hero getHero() {
        return hero;
    }

    public InteractionMap getInteractionMap() {
        return interactionMap;
    }

    public LevelState getLevelState() {
        return levelState;
    }

    public void setTimer(TimerSingleton timer) {
        this.timer = timer;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setInteractionMap(InteractionMap interactionMap) {
        this.interactionMap = interactionMap;
    }

    public void setLevelState(LevelState levelState) {
        this.levelState = levelState;
    }
}
