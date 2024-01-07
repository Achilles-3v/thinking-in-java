package chapter11.task29.holding;

import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Ivan Ivanov");
        map1.put(249, "Petr Petrov");
        map1.put(4614, "Svetlana Svetlova");
        map1.put(9126, "Igor Smirnov");
        map1.putIfAbsent(1000, "Ruslan Zimorev");

        System.out.println(map1);
        System.out.println(map1.get(1001));
        System.out.println(map1.containsKey(249));
        System.out.println(map1.containsValue("Igor Smirnov"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
