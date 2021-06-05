package Controls.KeyStrokes;

import Model.Element;

public class MoveDown implements KeyStroke {
    public boolean execute(Element element) {
        return element.moveDown();
    }
}
