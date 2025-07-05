import java.util.*;
public class stackdecending {
    public static void sort(Stack<Integer> s)
    {
        if(!s.isEmpty())
        {
           int top=s.pop();
           sort(s);
           pushinDecending(s,top);
        }
    }
    public static void pushinDecending(Stack<Integer> s, int element)
    {
        if(s.isEmpty() || element>s.peek())
        {
            s.push(element);
        }
        else {
            int temp=s.pop();
            pushinDecending(s,element);
            s.push(temp);
        }
    }
    public static void main(String args[])
    {
       Stack<Integer> s=new Stack<>();
       s.push(4);
       s.push(8);
       s.push(2);
       s.push(19);
       s.push(16);

       System.out.println("original stack is:"+ s);
       sort(s);

       while(!s.isEmpty())
       {
           System.out.println(s.pop());
           s.peek();
       }

    }
}
