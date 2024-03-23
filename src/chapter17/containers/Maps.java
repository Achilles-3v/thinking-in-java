package chapter17.containers;

import java.util.concurrent.*;
import java.util.*;
import net.achilles.util.*;

public class Maps {
    public static void printKeys(Map<Integer,String> map) {
        System.out.print("Size = " + map.size() + ", ");
        System.out.print("Keys: ");
        System.out.println(map.keySet()); // Produce a Set of the keys
    }
}
