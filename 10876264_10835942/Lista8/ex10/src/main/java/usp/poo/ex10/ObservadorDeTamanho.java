package usp.poo.ex10;

import java.util.Observable;
import java.util.Observer;

public class ObservadorDeTamanho implements Observer {

    public void update(Observable o, Object arg1) {
        PalavraObservavel palavra = (PalavraObservavel) o;
        System.out.println("Modificando string para conter o tamanho no final");
        System.out.println(palavra.getPalavra() + " " + palavra.getPalavra().length());
    }

}
