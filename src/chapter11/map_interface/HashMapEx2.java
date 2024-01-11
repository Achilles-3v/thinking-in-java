package chapter11.map_interface;

import java.util.*;

/**
 * Попробуем добавить новый элемент с уже имеющимся ключом
 * @version 1.42 2024-01-11
 */
public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(323211, "Ivanov Ivan");
        passportsAndNames.put(627232, "Petrov Petr");
        passportsAndNames.put(324811, "Sidorov Sidor");
        passportsAndNames.put(627232, "Orlov Igor");

        System.out.println(passportsAndNames);
    }
}