package chapter11.task14.holding;

import java.util.*;

/**
 * Любая реализация Iterable работает с foreach
 * @version 1.14 2024-01-03
 * @author Bruce Eckel
 */

public class IterableClass implements Iterable<String> {
    protected String[] words = ("Из этого можно сделать вывод, " +
            "что Земля имеет форму банана.").split(" ");
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            public boolean hasNext() {
                return index < words.length;
            }
            public String next() { return words[index++]; }
            public void remove() { // Не реализован
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        for(String s : new IterableClass())
            System.out.print(s + " ");
    }
}