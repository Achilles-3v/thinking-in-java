package chapter15.generics;

import java.util.*;

/**
 * Неограниченные маски
 * @version 15.36 2024-02-24
 * @author Bruce Eckel
 */
public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;
}
