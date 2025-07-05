import java.util.*;

public class stackreverse {
    public static void bottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        bottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int temp = s.pop();
        reverse(s);
        bottom(temp, s); // ✅ fixed variable name
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Stack before reverse: " + s);

        reverse(s);

        System.out.println("Stack after reverse: ");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
