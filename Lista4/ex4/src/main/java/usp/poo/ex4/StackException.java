package usp.poo.ex4;

public class StackException extends Exception {
    private String message;

    StackException (String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
