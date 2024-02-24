package chapter15.generics;

import java.util.*;

/**
 * Неограниченные маски
 * @version 15.37 2024-02-24
 * @author Bruce Eckel
 */
public class UnboundedWildcards2 {
    static Map map1;
    static Map<?,?> map2;
    static Map<String,?> map3;
    static void assign1(Map map) { map1 = map; }
    static void assign2(Map<?,?> map) { map2 = map; }
    static void assign3(Map<String,?> map) { map3 = map; }
}
