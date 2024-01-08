package chapter11.set_interface;

import java.util.*;

/**
 * В основе имеет HashMap без значения
 * @version 1.31 2024-01-08
 * @author Achilles
 */
public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ivan");
        set.add("Kirill");
        set.add("Maria");
        set.add("Oleg");

        set.remove("Ivan");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println(set.contains("Kirill"));
    }
}
