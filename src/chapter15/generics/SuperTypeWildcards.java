package chapter15.generics;

import java.util.*;

/**
 * Передать типизированный объект обобщенному типу
 * @version 15.33 2024-02-23
 * @author Bruce Eckel
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); // Error
    }
}
