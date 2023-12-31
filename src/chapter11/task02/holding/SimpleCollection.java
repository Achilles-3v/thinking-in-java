package chapter11.task02.holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Интерфейс collection обобщает концепцию последовательности
 * @version 1.02 2023-12-31
 * @author Bruce Eckel
 */

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Автоматическая упаковка
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}
