package chapter11.map_interface;

import java.util.*;

/**
 * Проверка наличия ключа и значения
 * @version 1.44 2024-01-11
 */
public class HashMapEx4 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(323211, "Ivanov Ivan");
        passportsAndNames.put(627232, "Petrov Petr");
        passportsAndNames.put(324811, "Sidorov Sidor");

        System.out.println(passportsAndNames.containsKey(123456));
        System.out.println(passportsAndNames.containsValue("Sidorov Sidor"));
    }
}