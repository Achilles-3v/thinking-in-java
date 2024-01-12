package chapter11.list_interface;

import java.util.*;

/**
 * Удаление объектов из List
 * @version 1.55 2024-01-12
 * @author Achilles
 */
public class ListEx5 {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Ivan");
        people.add("Oleg");
        people.add("Stepan");
        people.add("Viktor");
        people.add(1, "Marat");

        people.remove("Oleg");
        people.remove(0);
        System.out.println(people);
    }
}
