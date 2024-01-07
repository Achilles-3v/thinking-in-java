package chapter11.task29.holding;

import java.util.*;

/**
 * @version 1.29 2024-01-07
 * @author Achilles
 */
public class HashMapEx2 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Ivan", "Ivanov", 4);
        Student st2 = new Student("Petr", "Petrov", 3);
        Student st3 = new Student("Sidor", "Sidorov", 2);

        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);

        System.out.println(map);
        Student st4 = new Student("Ivan", "Ivanov", 4);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
    }
}
