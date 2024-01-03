package chapter11.task16.holding;

import java.util.*;

/**
 * Массив не реализует атоматически Iterable
 * @version 1.16 2024-01-03
 * @author Bruce Eckel
 */

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for(T t : ib)
            System.out.print(t + " ");
    }
    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = { "A", "B", "C" };
        // An array works in foreach, but it's not Iterable:
        //! test(strings);
        // You must explicitly convert it to an Iterable:
        test(Arrays.asList(strings));
    }
}
