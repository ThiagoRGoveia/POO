package Controls.KeyStrokes;

import Model.Element;

public class MoveRight implements KeyStroke {
    public boolean execute(Element element) {
        return element.moveRight();
    }
}
