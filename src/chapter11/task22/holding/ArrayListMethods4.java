package chapter11.task22.holding;

import java.util.ArrayList;

/**
 * Преобразование ArrayList в массив
 * @version 1.22 2024-01-05
 * @author Achilles
 */

public class ArrayListMethods4 {
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

        Object[] array = arrayList.toArray();
        String[] array2 = arrayList.toArray(new String[0]);
        for (String s : array2)
             System.out.print(s + " ");
    }
}
