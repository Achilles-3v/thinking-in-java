package chapter11.queue_interface;

import java.util.*;

public class QueueEx4 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Apple");
        deque.addFirst("Orange");
        deque.addLast("Pineapple");


        System.out.println("The First element is: "+ deque.getFirst());

        System.out.println("The Last element is: " + deque.getLast());

    }
}
