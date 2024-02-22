package chapter15.generics;

import java.util.*;

/**
 * Насколько умен компилятор?
 * @version 15.31 2024-02-22
 * @author Bruce Eckel
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist =
                Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0); // No warning
        flist.contains(new Apple()); // Argument is 'Object'
        flist.indexOf(new Apple()); // Argument is 'Object'
    }
}
