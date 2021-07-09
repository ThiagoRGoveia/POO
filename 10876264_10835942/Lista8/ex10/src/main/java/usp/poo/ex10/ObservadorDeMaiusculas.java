package usp.poo.ex10;

import java.util.Observable;
import java.util.Observer;

public class ObservadorDeMaiusculas implements Observer {

    public void update(Observable o, Object arg1) {
        PalavraObservavel palavra = (PalavraObservavel) o;
        System.out.println("Modificando string para letras maiúsculas");
        System.out.println(palavra.getPalavra().toUpperCase());
    }

}
