package chapter14.typeinfo.task05;

import java.util.*;

/**
 * Синтаксис параметризованных ссылок
 * @version 14.05 2024-01-29
 * @author Bruce Eckel
 */

class CountedInteger {
    private static long counter;
    private final long id = counter++;
    public String toString() { return Long.toString(id); }
}

public class FilledList<T> {

}
