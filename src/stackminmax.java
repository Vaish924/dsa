import java.util.*;
public class stackminmax {
    public static void max(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            System.out.println("stack is empty");
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Stack<Integer> temp=new Stack<>();

        while(!s.isEmpty())
        {
            int top=s.pop();
            if(top<min) min=top;
            if(top>max) max=top;
            temp.push(top);
        }
        while(!temp.isEmpty())
        {
            s.push(temp.pop());
        }
        System.out.println("minimum element:" +min);
        System.out.println("maximum element"+max);

    }
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(2);
        s.push(9);
        s.push(5);
        s.push(4);
        System.out.println("original stack"+s);

        max(s);
        System.out.println("stack after findmax" +s);


    }
}
