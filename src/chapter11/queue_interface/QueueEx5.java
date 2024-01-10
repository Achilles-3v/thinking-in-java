package chapter11.queue_interface;

import java.util.*;

public class QueueEx5 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Apple");
        deque.addFirst("Orange");
        deque.addLast("Pineapple");
        deque.add("Lemon");

        System.out.println(deque.pop()); // вытащит и удалит верхний элемент очереди
        System.out.println(deque.poll()); // вытащит и удалит верхний элемент очереди

        System.out.println(deque);
    }
}
