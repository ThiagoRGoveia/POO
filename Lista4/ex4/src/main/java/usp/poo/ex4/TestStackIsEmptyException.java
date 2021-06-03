package usp.poo.ex4;

public class TestStackIsEmptyException {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
