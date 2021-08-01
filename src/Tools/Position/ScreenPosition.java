package Tools.Position;

import java.io.Serializable;

//Abstração que  representa um pixel da tela
public class ScreenPosition implements Serializable {
    public int value;

    public ScreenPosition(int value) {
        this.value = value;
    }
}
