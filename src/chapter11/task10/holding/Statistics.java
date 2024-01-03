package chapter11.task10.holding;

import java.util.*;

/**
 * Простой пример использования HashMap
 * @version 1.10 2024-01-03
 * @author Bruce Eckel
 */

public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
