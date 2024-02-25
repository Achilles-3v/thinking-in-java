package chapter15.generics;

import java.util.*;

/**
 * Автоматическая упаковка компенсирует невозможность
 * использования примитивов с обобщениями
 * @version 15.40 2024-02-25
 * @author Bruce Eckel
 */
public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++)
            li.add(i);
        for(int i : li)
            System.out.print(i + " ");
    }
}
