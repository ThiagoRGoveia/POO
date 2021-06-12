package Controls;

import Model.Element;
import Model.Hero;
import Tools.Position.HitBox;
import Tools.Position.Position;

import java.util.ArrayList;

/**
 *
 * @author junio
 */
public class Controller {
    private Screen screen;

    public Controller (Screen screen) {
        this.screen = screen;
    }
    public void draw(ArrayList<Element> e){
        for(int i = 0; i < e.size(); i++){
            screen.drawer.draw(e.get(i));
        }
    }
    public void process(ArrayList<Element> e){
        Hero hero = (Hero)e.get(0); /*O heroi (protagonista) eh sempre o primeiro do array*/
        Element temp;
        /*Processa todos os demais em relacao ao heroi*/
        for(int i = 1; i < e.size(); i++){
            temp = e.get(i); /*Pega o i-esimo elemento do jogo*/
            /*Verifica se o heroi se sobrepoe ao i-ésimo elemento*/
            if(hero.getPosition().isSamePosition(temp.getPosition()))
                /*Nem todos os elementos podem ser transpostos pelo heroi*/
                if(!temp.canPassThrough())
                    e.remove(temp);
        }
    }
    public boolean isPositionValid(ArrayList<Element> elements, Hero hero){
            Element element;
            for(int i = 1; i < elements.size(); i++) {
                element = elements.get(i);
                boolean isHiting = HitBox.isHiting(element.getPosition(), hero.getPosition());
                if (isHiting){
                    System.out.println("HIT");
                }
            }
        return true;
    }
}
