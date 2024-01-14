package chapter12.stream;

import java.util.*;

/**
 * Использование reduce() в stream()
 * @version 1.7 2024-01-14
 * @author Achilles
 */
public class ReduceStream2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(2);

        int result = list.stream().reduce(1, (accumulator, element)->
                accumulator*element);
        System.out.println(result);
    }
}
