package chapter12.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Обработка данных с помощью stream().map()
 * Заменить слова на значение их длины
 * @version 1.61 2024-01-13
 * @author Achilles
 */
public class StreamMapEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        List<Integer> streamList = list.stream().map(element->element.length()).collect(Collectors.toList());
        System.out.println(streamList);
    }
}
