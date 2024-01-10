package chapter11.queue_interface;

import java.util.*;

public class QueueEx3 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Apple"); // Добавляет элемент Apple в конец очереди
        deque.addFirst("Orange"); // Добавляет элемент Orange в начало очереди
        deque.addLast("Pineapple"); // Добавляет элемент Pineapple в конец очереди

        System.out.println(deque);
    }
}
