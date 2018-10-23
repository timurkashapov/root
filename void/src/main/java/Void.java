import data_structures.Stack;

public class Void {

    private Void() {}

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        try {
            stack.push('c');
            stack.push('d');
            stack.push('0');

            System.out.println(stack.toString());
            stack.pop();
            System.out.println(stack.toString());
            stack.pop();
            System.out.println(stack.toString());


        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
