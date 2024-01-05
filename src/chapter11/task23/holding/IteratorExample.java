package chapter11.task23.holding;

import java.util.*;

/**
 * Создание объекта типа Iterator
 * @version 1.23 2024-01-05
 * @author Achilles
 */

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ivan");
        arrayList.add("Stepan");
        arrayList.add("Petr");
        arrayList.add("Kirill");
        arrayList.add("Maria");
        arrayList.add("Viktor");

        Iterator<String> iterator = arrayList.iterator();
//        while (iterator.hasNext())
//            System.out.print(iterator.next() + " ");
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);
    }
}
