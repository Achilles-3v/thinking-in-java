package chapter15.generics;

import java.util.*;

/**
 * Ограничения супертипа ослабляют требования
 * к тому, что может передоваться методу
 * @version 15.35 2024-02-23
 * @author Bruce Eckel
 */
public class GenericReading {
    static <T> T readExact(List<T> list) {
        return list.get(0);
    }
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());
    // A static method adapts to each call:
    static void f1() {
        Apple a = readExact(apples);
        Fruit f = readExact(fruit);
        f = readExact(apples);
    }
}
