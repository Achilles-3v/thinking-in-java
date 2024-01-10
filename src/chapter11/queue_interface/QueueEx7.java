package chapter11.queue_interface;

import java.util.*;

public class QueueEx7 {
    public static void main(String[] args) {
        Deque<String> friends = new ArrayDeque<>();

        friends.add("John");
        friends.add("Rob");
        friends.add("Greg");
        friends.add("Max");
        friends.add("Oliver");

        System.out.println("The first element is: " + friends.peekFirst());
        System.out.println("The last element is: " + friends.peekLast());

        System.out.println(friends);
    }
}
