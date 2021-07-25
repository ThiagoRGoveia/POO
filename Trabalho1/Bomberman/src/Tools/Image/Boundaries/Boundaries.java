package Tools.Image.Boundaries;

import java.io.Serializable;

// Esta classe define as dimensões do retangulo a ser recortado da imagem que contém as sprites
public class Boundaries implements Serializable {
    public int x;
    public int y;
    public int width;
    public int height;

    public Boundaries(
        int x,
        int y,
        int width,
        int height
    ) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
