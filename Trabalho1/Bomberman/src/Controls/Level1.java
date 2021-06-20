package Controls;

import Model.Element;
import Model.Blocks.IndestructableBlock;
import Model.Blocks.RegularBlock;
import Model.Enemies.BasicEnemy;
import Tools.Events.EventBus;

public class Level1 {
    private EventBus<Element> eventBus;
    public Level1( EventBus<Element> eventBus) {
        this.eventBus = eventBus;
    }

    public void drawGround() {

    }

    public void draw() {
        RegularBlock block;
        IndestructableBlock wall;
        BasicEnemy enemy;
        //wall = new IndestructableBlock(eventBus, 0, 0);
        //enemy = new BasicEnemy(eventBus, 0, 0);
        //block = new RegularBlock(eventBus, 0, 0);
        //eventBus.emit("create-element", block);
        //block = new RegularBlock(eventBus, 0, 1);

        //Bordas do mapa
        wall = new IndestructableBlock(eventBus, 0, 0); //início Lado esquedo
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 1);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 3);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 5);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 7);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 9);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 11);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 13);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 15);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 17);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 0, 19); // final lado esquerdo
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 1, 19); // início parte de baixo
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 3, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 5, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 7, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 9, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 11, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 13, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 15, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 17, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 19);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 19);//final da parte de baixo
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 1, 0); //início do topo do mapa
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 3, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 5, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 7, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 9, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 11, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 13, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 15, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 17, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 0);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 0);// final do topo do mapa
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 1); // início do lado direito do mapa
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 3);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 5);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 7);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 9);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 11);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 13);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 15);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 17);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 19, 18); //final lado direito
        eventBus.emit("create-element", wall);
        //bordas do mapa
        //obstáculos do meio do mapa
        wall = new IndestructableBlock(eventBus, 2, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 1, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 1, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 1, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 2, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 3, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 4, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 6, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 8, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 10, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 12, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 14, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 16, 18);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 2);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 4);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 6);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 8);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 10);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 12);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 14);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 16);
        eventBus.emit("create-element", wall);
        wall = new IndestructableBlock(eventBus, 18, 18);
        eventBus.emit("create-element", wall);
        //obstáculos do meio do mapa
        //destrutíveis do meio do mapa
        block = new RegularBlock(eventBus, 3, 1);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 4, 1);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 1);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 10, 1);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 1);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 12, 1);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 1);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 18, 1);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 2);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 7, 2);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 2);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 2);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 2);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 15, 2);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 17, 2);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 1, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 2, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 4, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 6, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 7, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 8, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 10, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 12, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 3);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 4);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 4);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 2, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 4, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 6, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 7, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 8, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 10, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 12, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 14, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 15, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 16, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 18, 5);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 6);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 6);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 6);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 6);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 6);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 15, 6);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 2, 7);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 7);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 8, 7);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 7);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 16, 7);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 18, 7);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 8);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 8);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 8);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 8);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 2, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 4, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 6, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 8, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 10, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 12, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 14, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 16, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 18, 9);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 10);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 10);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 10);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 10);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 10);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 2, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 4, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 6, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 8, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 10, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 12, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 14, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 16, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 18, 11);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 12);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 12);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 12);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 12);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 12);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 1, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 2, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 4, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 6, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 7, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 8, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 10, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 12, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 16, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 18, 13);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 1, 14);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 14);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 14);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 7, 14);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 14);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 14);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 14);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 1, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 2, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 4, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 6, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 7, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 8, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 10, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 12, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 14, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 16, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 18, 15);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 16);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 16);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 7, 16);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 16);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 16);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 16);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 15, 16);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 17, 16);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 17);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 17);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 18, 17);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 1, 18);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 3, 18);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 5, 18);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 7, 18);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 9, 18);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 11, 18);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 13, 18);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 15, 18);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 17, 18);
        eventBus.emit("create-element", block);
        //destrutíveis do meio do mapa
        //inimigos
        enemy = new BasicEnemy(eventBus, 17, 1);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 18, 3);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 7, 6);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 1, 7);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 12, 7);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 17, 7);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 15, 10);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 17, 12);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 7, 1);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 3, 17);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 8, 17);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 13, 17);
        eventBus.emit("create-enemy", enemy);
        enemy = new BasicEnemy(eventBus, 16, 17);
        eventBus.emit("create-enemy", enemy);
        //inimigos


    }
}
