package chapter11.task07.holding;

import net.achilles.util.*;

/**
 * Использование имени пакета для
 * предотвращения конфликтов
 * @version 1.07 2024-01-01
 * @author Bruce Eckel
 */

public class StackCollision {
    public static void main(String[] args) {
        net.achilles.util.Stack<String> stack =
                new net.achilles.util.Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack2 =
                new java.util.Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while(!stack2.empty())
            System.out.print(stack2.pop() + " ");
    }
}
