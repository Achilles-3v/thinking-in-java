package chapter15.generics;

import chapter14.typeinfo.pets.*;
import java.util.*;
import net.achilles.util.*;

public class ExplicitTypeSpecification {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
