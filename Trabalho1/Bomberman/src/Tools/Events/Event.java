package Tools.Events;

import java.io.Serializable;

import Controls.GameManager;
import Model.Element;
// Interface que define os eventos e permite que eles sejam disparados polimorficamente
public interface Event extends Serializable {
    public void fire(GameManager gameManager, Element element);
}
