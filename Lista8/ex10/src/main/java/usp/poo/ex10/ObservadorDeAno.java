package usp.poo.ex10;

import java.util.Observable;
import java.util.Observer;
import java.time.LocalDate;

public class ObservadorDeAno implements Observer{

    public void update(Observable o, Object arg1) {
        PalavraObservavel palavra = (PalavraObservavel) o;
        System.out.println("Modificando string para conter o ano no final");
        System.out.println(palavra.getPalavra() + " " + LocalDate.now().getYear());
    }

}
