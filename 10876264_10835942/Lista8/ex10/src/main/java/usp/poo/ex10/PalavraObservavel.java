package usp.poo.ex10;

import java.util.Observable;

public class PalavraObservavel extends Observable {
    private String palavra;


    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
        this.setChanged();
    }
}
