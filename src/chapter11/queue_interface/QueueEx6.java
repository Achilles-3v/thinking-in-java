package chapter11.queue_interface;

import java.util.*;

public class QueueEx6 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Apple");
        deque.addFirst("Orange");
        deque.addLast("Pineapple");
        deque.add("Lemon");

        System.out.println(deque.pollFirst()); // вытащит и удалит первый элемент очереди
        System.out.println(deque.pollLast()); // вытащит и удалит последний элемент очереди.
        System.out.println(deque);
    }
}
