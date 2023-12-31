package chapter11.task25.holding;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();

        for(char ch : s.toCharArray())
            list.add(ch);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());
        boolean isPalindrome = true;

        while(iterator.hasNext() && reversIterator.hasPrevious()) {
            if (iterator.next() != reversIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");
    }
}
