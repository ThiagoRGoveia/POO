package usp.poo.ex5;

public class Superpoder {
    private int categoria;
    private String tipo;
    private String nome;
    private int fator;

    Superpoder (int pCategoria, String pTipo, String pNome, int pFator) {
        categoria = pCategoria;
        tipo = pTipo;
        nome = pNome;
        fator = pFator;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setCategoria(int pCategoria) {
        categoria = pCategoria;
    }

    public void setNome (String pNome) {
        nome = pNome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String ptipo) {
        tipo = ptipo;
    }

    public int getFator() {
        return fator;
    }

    public void setFator(int pfator) {
        fator = pfator;
    }

}
