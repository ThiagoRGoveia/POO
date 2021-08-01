package Controls.KeyStrokes;

import java.io.Serializable;

import Controls.Screen;

// Inteface que permite que sejam criadas ações vinculadas à teclas
public interface KeyStroke extends Serializable {
    public void execute(Screen screen);
}
