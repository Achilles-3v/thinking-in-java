package chapter11.queue_interface;

import java.util.*;

/**
 * FIFO
 * @version 1.32 2023-01-10
 * @author Achilles
 */
public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ivan");
        queue.add("Oleg");
        queue.add("Stepan");
        queue.add("Ruslan");
        queue.add("Anna");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
