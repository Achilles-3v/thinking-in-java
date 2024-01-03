package chapter11.task11.holding;

import java.util.*;

/**
 * Восходящее преобразование Queue в LinkedList
 * @version 1.11 2024-01-03
 * @author Bruce Eckel
 */

public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++)
            queue.offer(random.nextInt(i + 10));
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}
