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
    private Class<T> type;
    public FilledList(Class<T> type) { this.type = type; }
    public List<T> create(int nElements) {
        List<T> result = new ArrayList<T>();
        try {
            for(int i = 0; i < nElements; i++)
                result.add(type.newInstance());
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
