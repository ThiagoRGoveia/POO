package Tools.Position;

import java.io.Serializable;

// Abstração que representa um quadrado da tela
public class Coordinate implements Serializable {
    public int value;

    public Coordinate(int value) {
        this.value = value;
    }
}
