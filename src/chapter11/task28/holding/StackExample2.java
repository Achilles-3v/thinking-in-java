package chapter11.task28.holding;

import java.util.*;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Sveta");
        stack.push("Oleg");
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
