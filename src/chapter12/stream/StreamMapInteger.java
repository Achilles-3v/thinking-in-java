package chapter12.stream;

import java.util.*;

/**
 * Обработка данных Integer с помощью stream().map()
 * @version 1.63 2024-01-13
 * @author Achilles
 */
public class StreamMapInteger {
    public static void main(String[] args) {
        int[] array = {7, 4, 6, 8, 3, 12, 5};

        array = Arrays.stream(array).map(element->{
            if (element % 2 == 0) {
                element = element / 2;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));
    }
}
