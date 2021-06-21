package Tools.Position;

// Classe que representa a posição no eixo horizontal

public class Column extends Cell {
    public Column (ScreenPosition screenPosition) {
        super(screenPosition);
    }

    public Column (Coordinate coordinate) {
        super(coordinate);
    }
}
