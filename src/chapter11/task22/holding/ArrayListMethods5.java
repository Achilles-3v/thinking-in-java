package chapter11.task22.holding;

import java.util.*;

/**
 * Не изменяемые листы,
 * не могут содержать значение null
 * @version 1.22 2024-01-05
 * @author Achilles
 */
public class ArrayListMethods5 {
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

        List<Integer> list = List.of(2, 6, 15, 4);
        System.out.println(list);
//        list.add(65); // Exception

        List<String> list2 = List.copyOf(arrayList);
        System.out.println(list2);
    }
}
