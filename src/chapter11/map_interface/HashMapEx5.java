package chapter11.map_interface;

import java.util.*;

/**
 * Получение списка всех ключей и значений
 * @version 1.45 2024-01-11
 */
public class HashMapEx5 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(323211, "Ivanov Ivan");
        passportsAndNames.put(627232, "Petrov Petr");
        passportsAndNames.put(324811, "Sidorov Sidor");

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);
    }
}