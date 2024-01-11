package chapter11.map_interface;

import java.util.*;

/**
 * Удаляет все элементы
 * @version 1.46 2024-01-11
 */
public class HashMapEx6 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(323211, "Ivanov Ivan");
        passportsAndNames.put(627232, "Petrov Petr");
        passportsAndNames.put(324811, "Sidorov Sidor");

        System.out.println(passportsAndNames.size());
        passportsAndNames.clear();
        System.out.println(passportsAndNames);
    }
}