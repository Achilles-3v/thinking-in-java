package chapter11.queue_interface;

import java.util.*;

public class QueueEx2 {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));
        priorityQueue.add("Andrew");
        priorityQueue.add("John");

        priorityQueue.add("Rob");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
