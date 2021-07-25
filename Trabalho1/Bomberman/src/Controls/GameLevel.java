package Controls;

import Tools.Events.EventBus;
import Tools.Image.AnimatorFactory;
import Tools.Image.ImageFactory;

import java.io.Serializable;

import Model.Blocks.IndestructableBlock;
import Model.Blocks.RegularBlock;
import Model.Enemies.BasicEnemy;

// Esta classe define as fases do jogo, cada uma de suas filhas sera composta
// por uma classe BoundariesFactoryLevelX que determina as imagens a serem carregadas
public abstract class GameLevel implements Serializable {
    protected ImageFactory imageFactory;
    protected Screen screen;

    public GameLevel(Screen screen) {
        this.screen = screen;
    }

    public void begin() {
        screen.setAnimatorFactory(
            new AnimatorFactory(imageFactory)
        );
    }

    public ImageFactory getImageFactory() {
        return imageFactory;
    }

    public void setImageFactory(ImageFactory imageFactory) {
        this.imageFactory = imageFactory;
    }

    public void draw() {
        //Bordas do mapa
        for (int[] coordinates: getWallPositions()) {
            EventBus.getInstance().emit(
                "create-element",
                new IndestructableBlock(coordinates[0],coordinates[1])
            );
        }

        //Criação dos blocos destrutíveis
        for (int[] coordinates: getRegularBlockPositions()) {
            EventBus.getInstance().emit(
                "create-element",
                new RegularBlock(coordinates[0],coordinates[1])
            );
        }

        //Criação dos inimigos
        for (int[] coordinates: getEnemyPositions()) {
            EventBus.getInstance().emit(
                "create-enemy",
                new BasicEnemy(coordinates[0],coordinates[1])
            );
        }


    }


    protected abstract int[][] getWallPositions();
    protected abstract int[][] getRegularBlockPositions();
    protected abstract int[][] getEnemyPositions();

}
