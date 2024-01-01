package chapter11.task05.holding;

import java.util.*;

/**
 * Контейнеры распечатываются автоматически
 * @version 1.05 2024-01-01
 * @author Bruce Eckel
 */

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("крыса");
        collection.add("кошка");
        collection.add("собака");
        collection.add("собака");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("крыса", "Анфиса");
        map.put("кошка", "Мурка");
        map.put("собака", "Шарик");
        map.put("собака", "Бобик");
        return map;
    }

    public static void main(String[] args) {

        System.out.println(fill( new ArrayList<String>()));
        System.out.println(fill( new LinkedList<String>()));
        System.out.println(fill( new HashSet<String>()));
        System.out.println(fill( new TreeSet<String>()));
        System.out.println(fill( new LinkedHashSet<String>()));
        System.out.println(fill( new HashMap<String, String>()));
        System.out.println(fill( new TreeMap<String, String>()));
        System.out.println(fill( new LinkedHashMap<String, String>()));
    }
}
