package chapter11.task07.holding;

import net.achilles.util.*;

/**
 * Пример использования класса Stack
 * @version 1.07 2024-01-01
 * @author Bruce Eckel
 */

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
