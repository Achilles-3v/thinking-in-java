package chapter11.list_interface;

import java.util.*;

/**
 * List to Array
 * @version 1.56 2024-01-12
 * @author Achilles
 */
public class ListEx6 {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Ivan");
        people.add("Oleg");
        people.add("Stepan");
        people.add("Viktor");
        people.add(1, "Marat");

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){
            System.out.println(person);
        }
    }
}
