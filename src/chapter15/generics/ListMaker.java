package chapter15.generics;

import java.util.*;

/**
 * Создание контейнера вместо массива
 * @version 15.17 2024-02-18
 * @author Bruce Eckel
 */
public class ListMaker<T> {
    List<T> create() { return new ArrayList<T>(); }
    public static void main(String[] args) {
        ListMaker<String> stringMaker= new ListMaker<String>();
        List<String> stringList = stringMaker.create();
    }
}
