package chapter11.task08.holding;

import java.util.*;

/**
 * Реализация HashSet используется с объектами Integer
 * @version 1.08 2024-01-02
 * @author Bruce Eckel
 */

public class SetOfInteger {
    public static void main(String[] args) {

        Random random = new Random(47);
        Set<Integer> intset = new LinkedHashSet<>();
        for (int i = 0; i < 10000; i++)
            intset.add(random.nextInt(30));
        System.out.println(intset);
    }
}
