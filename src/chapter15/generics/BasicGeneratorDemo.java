package chapter15.generics;

import net.achilles.util.*;

/**
 * @version 15.15 2024-02-14
 * @author Bruce Eckel
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BasicGenerator.create(CountedObject.class);
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}
