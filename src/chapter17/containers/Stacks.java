package chapter17.containers;

import java.util.*;

enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER }

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(Month m : Month.values())
            stack.push(m.toString());
        System.out.println("stack = " + stack);
        stack.addElement("The last line");
        System.out.println("element 5 = " + stack.elementAt(5));
        System.out.println("popping elements:");
        while(!stack.empty())
            System.out.print(stack.pop() + " ");

        LinkedList<String> lstack = new LinkedList<String>();
        for(Month m : Month.values())
            lstack.addFirst(m.toString());
        System.out.println("lstack = " + lstack);
        while(!lstack.isEmpty())
            System.out.print(lstack.removeFirst() + " ");

        net.achilles.util.Stack<String> stack2 =
                new net.achilles.util.Stack<String>();
        for(Month m : Month.values())
            stack2.push(m.toString());
        System.out.println("stack2 = " + stack2);
        while(!stack2.empty())
            System.out.print(stack2.pop() + " ");

    }
}
