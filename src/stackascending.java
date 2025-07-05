import java.util.*;
public class stackascending {
    public static void sortStack(Stack<Integer> s)
    {
        if(!s.isEmpty())
        {
            int top=s.pop();
            sortStack(s);
            insertinSortedOrder(s,top);
        }
    }

    public static void insertinSortedOrder(Stack<Integer> s,int element)
    {
        if(s.isEmpty() || element<s.peek())
        {
            s.push(element);
        }
        else {
            int temp=s.pop();
            insertinSortedOrder(s,element);
            s.push(temp);
        }
    }
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original stack: " + stack);
        sortStack(stack);

        System.out.println("Sorted stack (ascending, smallest at top):");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
