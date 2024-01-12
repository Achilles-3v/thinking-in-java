package chapter11.list_interface;

import java.util.*;

/**
 * Установка нового значения List
 * @version 1.51 2024-01-12
 * @author Achilles
 */
public class ListEx2 {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Ivan");
        people.add("Oleg");
        people.add("Stepan");
        people.add("Viktor");
        people.add(1, "Marat");
        System.out.println(people);

        people.set(1, "Robert");
        System.out.println(people);
    }
}
