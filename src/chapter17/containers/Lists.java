package chapter17.containers;

import java.util.*;
import net.achilles.util.*;

public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        a.add(1, "x"); // Add at location 1
        a.add("x"); // Add at end
        // Add a collection:
        a.addAll(Countries.names(25));
        // Add a collection starting at location 3:
        a.addAll(3, Countries.names(25));
        b = a.contains("1"); // Is it in there?
        // Is the entire collection in there?
        b = a.containsAll(Countries.names(25));
        // Lists allow random access, which is cheap
        // for ArrayList, expensive for LinkedList:
        s = a.get(1); // Get (typed) object at location 1
        i = a.indexOf("1"); // Tell index of object
        b = a.isEmpty(); // Any elements inside?
        it = a.iterator(); // Ordinary Iterator
        lit = a.listIterator(); // ListIterator
        lit = a.listIterator(3); // Start at loc 3
        i = a.lastIndexOf("1"); // Last match
        a.remove(1); // Remove location 1
        a.remove("3"); // Remove this object
        a.set(1, "y"); // Set location 1 to "y"
        // Keep everything that's in the argument
        // (the intersection of the two sets):
        a.retainAll(Countries.names(25));
        // Remove everything that's in the argument:
        a.removeAll(Countries.names(25));
        i = a.size(); // How big is it?
        a.clear(); // Remove all elements
    }

    public static void iterMotion(List<String> a) {
        ListIterator<String> it = a.listIterator();
        b = it.hasNext();
        b = it.hasPrevious();
        s = it.next();
        i = it.nextIndex();
        s = it.previous();
        i = it.previousIndex();
    }

    public static void iterManipulation(List<String> a) {
        ListIterator<String> it = a.listIterator();
        it.add("47");
        it.next();
        it.remove();
        it.next();
        it.set("47");
    }

    public static void testVisual(List<String> a) {
        System.out.println(a);
        List<String> b = Countries.names(25);
        System.out.println("b = " + b);
        a.addAll(b);
        a.addAll(b);
        System.out.println(a);
        ListIterator<String> x = a.listIterator(a.size()/2);
        x.add("one");
        System.out.println(a);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        System.out.println(a);
        // Traverse the list backwards:
        x = a.listIterator(a.size());
        while(x.hasPrevious())
            System.out.print(x.previous() + " ");
        System.out.println();
        System.out.println("testVisual finished");
    }

    public static void testLinkedList() {
        LinkedList<String> ll = new LinkedList<String>();
        ll.addAll(Countries.names(25));
        System.out.println(ll);
        ll.addFirst("one");
        ll.addFirst("two");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll);
    }

    public static void main(String[] args) {
        basicTest(
                new LinkedList<String>(Countries.names(25)));
        basicTest(
                new ArrayList<String>(Countries.names(25)));
        iterMotion(
                new LinkedList<String>(Countries.names(25)));
        iterMotion(
                new ArrayList<String>(Countries.names(25)));
        iterManipulation(
                new LinkedList<String>(Countries.names(25)));
        iterManipulation(
                new ArrayList<String>(Countries.names(25)));
        testVisual(
                new LinkedList<String>(Countries.names(25)));
        testLinkedList();
    }
}
