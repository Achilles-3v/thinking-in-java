package chapter11.map_interface;

import java.util.*;

/**
 * Добавление новой пары в HashMap
 * @version 1.41 2024-01-11
 */
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(323211, "Ivanov Ivan");
        passportsAndNames.put(627232, "Petrov Petr");
        passportsAndNames.put(324811, "Sidorov Sidor");

        System.out.println(passportsAndNames);
    }
}
