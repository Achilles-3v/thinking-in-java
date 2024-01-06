package chapter11.task26.holding;

import java.util.*;

/**
 * Бинарный поиск в коллекции
 * @version 1.26 2024-01-06
 * @author Achilles
 */

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList, 12);
        System.out.println(index);
    }
}
