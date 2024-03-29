package chapter16.arrays;

import java.util.*;
import net.achilles.util.*;

public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen =
                new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(
                Generated.array(new Integer[25], gen));
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        while(true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if(location >= 0) {
                System.out.println("Location of " + r + " is " + location +
                        ", a[" + location + "] = " + a[location]);
                break; // Out of while loop
            }
        }
    }
}
