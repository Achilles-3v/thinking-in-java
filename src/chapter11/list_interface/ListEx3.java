package chapter11.list_interface;

import java.util.*;

/**
 * Перебор в цикле foreach
 * @version 1.53 2024-01-12
 * @author Achilles
 */
public class ListEx3 {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Ivan");
        people.add("Oleg");
        people.add("Stepan");
        people.add("Viktor");
        people.add(1, "Marat");

        System.out.printf("ArrayList has %d elements \n", people.size());

        for(String person : people){
            System.out.println(person);
        }
    }
}
