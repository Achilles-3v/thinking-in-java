package chapter11.task30.holding;

import java.util.*;
import chapter11.task29.holding.Student;


public class LinkedHashMapEx {
    public static void main(String[] args) {
        Map<Double, Student> map = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Ivan", "Ivanov", 4);
        Student st2 = new Student("Petr", "Petrov", 3);
        Student st3 = new Student("Sidor", "Sidorov", 3);
        Student st4 = new Student("Denis", "Abramov", 1);

        map.put(7.2, st3);
        map.put(7.5, st4);
        map.put(5.8, st1);
        map.put(6.4, st2);

        System.out.println(map);

        System.out.println(map.get(5.8));
        System.out.println(map.get(7.5));

        System.out.println(map);
    }
}
