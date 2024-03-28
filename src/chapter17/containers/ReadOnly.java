package chapter17.containers;

import java.util.*;
import net.achilles.util.*;

public class ReadOnly {
    static Collection<String> data =
            new ArrayList<String>(Countries.names(6));
    public static void main(String[] args) {
        Collection<String> c =
                Collections.unmodifiableCollection(
                        new ArrayList<String>(data));
        System.out.println(c);

        List<String> a = Collections.unmodifiableList(
                new ArrayList<String>(data));
        ListIterator<String> lit = a.listIterator();
        System.out.println(lit.next());

        Set<String> s = Collections.unmodifiableSet(
                new HashSet<String>(data));
        System.out.println(s);

        Set<String> ss = Collections.unmodifiableSortedSet(
                new TreeSet<String>(data));

        Map<String,String> m = Collections.unmodifiableMap(
                new HashMap<String,String>(Countries.capitals(6)));
        System.out.println(m);

        Map<String,String> sm =
                Collections.unmodifiableSortedMap(
                        new TreeMap<String,String>(Countries.capitals(6)));
    }
}
