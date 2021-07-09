package usp.poo.ex10;

public class Main {
    public static void main(String[] args) {
        PalavraObservavel palavraObservavel = new PalavraObservavel();
        ObservadorDeMaiusculas observadorDeMaiusculas = new ObservadorDeMaiusculas();
        ObservadorDeTamanho observadorDeTamanho = new ObservadorDeTamanho();
        ObservadorDeAno observadorDeAno = new ObservadorDeAno();

        palavraObservavel.addObserver(observadorDeMaiusculas);
        palavraObservavel.addObserver(observadorDeTamanho);
        palavraObservavel.addObserver(observadorDeAno);

        palavraObservavel.setPalavra("Uma string");
        palavraObservavel.notifyObservers(palavraObservavel);
        palavraObservavel.setPalavra("Outra string");
        palavraObservavel.notifyObservers(palavraObservavel);

    }
}
