package chapter12.stream;

import java.util.*;

/**
 * Использование reduce() в stream()
 * @version 1.8 2024-01-14
 * @author Achilles
 */
public class ReduceString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        String result = list.stream().reduce((a, e) ->
                a + " - " + e).get();
        System.out.println(result);
    }
}
