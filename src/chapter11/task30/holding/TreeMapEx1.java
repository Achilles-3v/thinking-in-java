package chapter11.task30.holding;

import java.util.*;
import chapter11.task29.holding.Student;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Ivan", "Ivanov", 4);
        Student st2 = new Student("Petr", "Petrov", 3);
        Student st3 = new Student("Sidor", "Sidorov", 3);
        Student st4 = new Student("Denis", "Abramov", 1);
        Student st5 = new Student("Kostya", "Ilin", 2);
        Student st6 = new Student("Oleg", "Dovidov", 4);
        Student st7 = new Student("Viktor", "Osipov", 2);

        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(7.5, st4);
        treeMap.put(7.2, st3);
        treeMap.put(8.2, st6);
        treeMap.put(7.9, st5);

        System.out.println(treeMap);
        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(7.3));
    }
}
