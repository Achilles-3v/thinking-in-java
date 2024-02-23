package chapter15.generics;

import java.util.*;

/**
 * Ограничения супертипа ослабляют требования
 * к тому, что может передоваться методу
 * @version 15.34 2024-02-23
 * @author Bruce Eckel
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();
}
