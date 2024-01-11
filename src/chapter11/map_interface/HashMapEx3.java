package chapter11.map_interface;

import java.util.*;

/**
 * Доступ к значениям в HashMap осуществляется по ключу
 * @version 1.41 2024-01-11
 */
public class HashMapEx3 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(323211, "Ivanov Ivan");
        passportsAndNames.put(627232, "Petrov Petr");
        passportsAndNames.put(324811, "Sidorov Sidor");

        String lidiaName = passportsAndNames.get(323211);
        System.out.println(lidiaName);

        passportsAndNames.remove(627232);
        System.out.println(passportsAndNames);
    }
}