package Controls.KeyStrokes;

import Controls.Screen;

// Inteface que permite que sejam criadas ações vinculadas à teclas
public interface KeyStroke {
    public void execute(Screen screen);
}
