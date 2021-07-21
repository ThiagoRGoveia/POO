package Tools.Image;

import java.io.Serializable;

// Interface implementada pelas classes aninhadas da classe
// Animator factory e permite que elas sejam acessadas polimorficamente
public interface Creatable extends Serializable {
    public Animator create();
}
