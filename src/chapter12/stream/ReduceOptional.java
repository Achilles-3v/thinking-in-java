package chapter12.stream;

import java.util.*;

/**
 * Использование Optional в stream().reduce()
 * @version 1.6 2024-01-14
 * @author Achilles
 */
public class ReduceOptional {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(2);

        Optional<Integer> o = list.stream().reduce((accumulator, element) ->
                accumulator*element);
        if (o.isPresent())
            System.out.println(o.get());
        else
            System.out.println("Not present");
    }
}
