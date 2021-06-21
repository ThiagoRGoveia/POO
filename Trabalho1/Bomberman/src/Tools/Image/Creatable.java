package Tools.Image;
// Interface implementada pelas classes aninhadas da classe
// Animator factory e permite que elas sejam acessadas polimorficamente
public interface Creatable {
    public Animator create();
}
