package chapter12.stream;

import java.util.*;

/**
 * Использование forEach() в stream()
 * @version 1.1 2024-01-14
 * @author Achilles
 */
public class StreamForEach {
    public static void main(String[] args) {
        int[] array = {1, 7, 4, 8, 3};
        Arrays.stream(array).forEach(el->
        {
            el*=2;
            System.out.println(el);
        });
    }
}
