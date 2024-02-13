package chapter15.generics;

import java.util.*;

/**
 * Список аргументов переменной длины
 * @version 15.11 2024-02-13
 * @author Bruce Eckel
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for(T item : args)
            result.add(item);
        return result;
    }
}
