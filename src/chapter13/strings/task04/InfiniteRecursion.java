package chapter13.strings.task04;

import java.util.*;

/**
 * Accidental recursion
 * @version 13.04 2024-01-23
 * @author Bruce Eckel
 */
public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }
    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<InfiniteRecursion>();
        for(int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}
