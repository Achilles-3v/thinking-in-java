package chapter15.generics;

import net.achilles.util.*;

/**
 * Генерирование последовательности Фибоначчи
 * @version 15.08 2024-02-12
 * @author Bruce Eckel
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;
    public Integer next() { return fib(count++); }
    private int fib(int n) {
        if(n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }
}
