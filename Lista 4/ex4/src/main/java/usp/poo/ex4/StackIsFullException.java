package usp.poo.ex4;

public class StackIsFullException extends StackException {
    StackIsFullException () {
        super("The stack is full");
    }
}
