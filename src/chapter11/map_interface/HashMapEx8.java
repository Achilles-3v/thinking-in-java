package chapter11.map_interface;

import java.util.*;

/**
 * Объединение двух мап в одну
 * @version 1.48 2024-01-11
 */
public class HashMapEx8 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put(323211, "Ivanov Ivan");
        passportsAndNames.put(627232, "Petrov Petr");
        passportsAndNames.put(324811, "Sidorov Sidor");

        passportsAndNames2.put(128787, "Smirnov Stanislav");
        passportsAndNames2.put(774456, "Orlov Igor");

        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames);
    }
}
