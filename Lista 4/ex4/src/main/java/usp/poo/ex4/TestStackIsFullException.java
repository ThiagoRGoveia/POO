package usp.poo.ex4;

public class TestStackIsFullException {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
