package Controls.KeyStrokes;

import Model.Element;

public class MoveUp implements KeyStroke {
    public boolean execute(Element element) {
        return element.moveUp();
    }
}
