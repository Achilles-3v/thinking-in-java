package chapter12.stream;

import java.util.*;

/**
 * Использование forEach() в stream()
 * Ссылка на референс
 * @version 1.3 2024-01-14
 * @author Achilles
 */
public class ForEachEx {
    public static void main(String[] args) {
        int[] array = {1, 7, 4, 8, 3};
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Number = " + a);
    }
}
