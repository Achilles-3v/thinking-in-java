package chapter11.task21.holding;

import java.util.*;

/**
 * Методы ArrayList
 * @version 1.21 2024-01-05
 * @author Achilles
 */

public class ArrayListMethods {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        array[0].append("!!!");
        System.out.println(list);

        array[1] = new StringBuilder("F");
        System.out.println(list);
    }
}
