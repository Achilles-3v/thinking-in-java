package chapter11.task22.holding;

import java.util.*;

/**
 * Отдельное представление ArrayList
 * @version 1.22 2024-01-05
 * @author Achilles
 */

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ivan");
        arrayList.add("Stepan");
        arrayList.add("Petr");
        arrayList.add("Kirill");
        arrayList.add("Maria");
        arrayList.add("Viktor");
        arrayList.add("Svetlana");
        arrayList.add("Boris");
        System.out.println(arrayList);

        List<String> myList = arrayList.subList(2, 6);
        System.out.println(myList);

        myList.add("Fedor");
        System.out.println(myList);
        System.out.println(arrayList);
    }
}
