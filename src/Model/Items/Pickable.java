package Model.Items;

import Model.Hero;

// Esta interface define as ações realizadas quando o herói pega um item
public interface Pickable {
    public void pickUp(Hero hero);
}
