package chapter11.task13.holding;

import java.util.*;

/**
 * Все колекции работают с foreach
 * @version 1.13 2024-01-03
 * @author Bruce Eckel
 */

public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "Один два три четыре пять".split(" "));
        for (String s : cs)
            System.out.print("'" + s + "' ");
    }
}
