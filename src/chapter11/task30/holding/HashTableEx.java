package chapter11.task30.holding;

import chapter11.task29.holding.Student;

import java.util.*;

/**
 * Устаревший класс. Является synchronized
 * @version 1.30 2024-01-08
 * @author Achilles
 */
public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Ivan", "Ivanov", 4);
        Student st2 = new Student("Petr", "Petrov", 3);
        Student st3 = new Student("Sidor", "Sidorov", 3);
        Student st4 = new Student("Denis", "Abramov", 1);

        ht.put(7.2, st3);
        ht.put(7.5, st4);
        ht.put(5.8, st1);
        ht.put(6.4, st2);

        System.out.println(ht);
    }
}
