package chapter17.containers;

import java.util.*;
import net.achilles.util.*;

public class Enumerations {
    public static void main(String[] args) {
        Vector<String> v =
                new Vector<String>(Countries.names(10));
        Enumeration<String> e = v.elements();
        while(e.hasMoreElements())
            System.out.print(e.nextElement() + ", ");
        // Produce an Enumeration from a Collection:
        e = Collections.enumeration(new ArrayList<String>());
    }
}
