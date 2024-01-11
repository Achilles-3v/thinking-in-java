package chapter11.map_interface;

import java.util.*;

/**
 * Для проверки того, есть ли в нашей HashMap хотя бы один элемент
 * @version 1.47 2024-01-11
 */
public class HashMapEx7 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(323211, "Ivanov Ivan");
        passportsAndNames.put(627232, "Petrov Petr");
        passportsAndNames.put(324811, "Sidorov Sidor");

        if (!passportsAndNames.isEmpty()) {
            System.out.println(passportsAndNames);
        }
    }
}