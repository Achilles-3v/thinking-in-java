package chapter15.generics;

import net.achilles.util.*;

/**
 * @version 15.42 2024-02-25
 * @author Bruce Eckel
 */

class FArray {
    public static <T> T[] fill(T[] a, Generator<T> gen) {
        for(int i = 0; i < a.length; i++)
            a[i] = gen.next();
        return a;
    }
}

public class PrimitiveGenericTest {

}
