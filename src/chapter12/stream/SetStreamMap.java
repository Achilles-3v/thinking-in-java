package chapter12.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Обработка данных в Set stream().map()
 * Заменить слова на число букв в каждом слове
 * @version 1.65 2024-01-13
 * @author Achilles
 */
public class SetStreamMap {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("On");
        set.add("Two");
        set.add("Three!");
        set.add("Four?");
        set.add("Five");

        System.out.println(set);

        Set<Integer> setInt = set.stream().map(e->e.length()).collect(Collectors.toSet());
        System.out.println(setInt);

        List<Integer> listInt = set.stream().map(e->e.length()).collect(Collectors.toList());
        System.out.println(listInt);
    }
}
