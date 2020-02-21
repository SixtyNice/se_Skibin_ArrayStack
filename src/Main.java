
public class Main {
    public static void main(String[] args) {


        ArrayStack stack = new ArrayStack(5);
        for (int i = 0; i < stack.getMaximum(); i++) {
            stack.push(i);
        }

        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }


}
