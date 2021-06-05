package Controls.KeyStrokes;

import Model.Element;

public class MoveLeft implements KeyStroke {
    public boolean execute(Element element) {
        return element.moveLeft();
    }
}
