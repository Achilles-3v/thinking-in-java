package chapter12.stream;

import java.util.*;

/**
 * Обработка данных в цикле
 * Заменить слова на число букв в каждом слове
 * @version 1.61 2024-01-13
 * @author Achilles
 */
public class StreamMapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }

        System.out.println(list);
    }
}
