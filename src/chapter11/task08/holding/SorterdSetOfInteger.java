package chapter11.task08.holding;

import java.util.*;

/**
 * Использование TreeSet для сортированного хранения
 * @version 1.08 2024-01-02
 * @author Bruce Eckel
 */

public class SorterdSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> intset = new TreeSet<>();
        for (int i = 0; i < 10000; i++)
            intset.add(random.nextInt(30));
        System.out.println(intset);
    }
}
