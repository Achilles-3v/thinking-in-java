package chapter11.set_interface;

import java.util.*;

/**
 * @version 1.32 2024-01-08
 * @author Achilles
 */
public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(8);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(7);
        hs2.add(4);
        hs2.add(3);
        hs2.add(5);
        hs2.add(8);

        HashSet<Integer> union = new HashSet<>(hs);
        union.addAll(hs2);
        System.out.println(union);
    }
}
