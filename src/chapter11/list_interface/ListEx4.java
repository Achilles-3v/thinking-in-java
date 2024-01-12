package chapter11.list_interface;

import java.util.*;

/**
 * Проверяем наличие элемента в List
 * @version 1.51 2024-01-12
 * @author Achilles
 */
public class ListEx4 {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Ivan");
        people.add("Oleg");
        people.add("Stepan");
        people.add("Viktor");
        people.add(1, "Marat");

        if(people.contains("Viktor")){
            System.out.println("ArrayList contains Viktor");
        }
    }
}
