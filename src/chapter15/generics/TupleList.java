package chapter15.generics;

import java.util.*;
import net.achilles.util.*;

/**
 * Создание сложных обобщенных типов
 * посредством объединения обобщенных типов
 * @version 15.20 2024-02-15
 * @author Bruce Eckel
 */
public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> tl =
                new TupleList<Vehicle, Amphibian, String, Integer>();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());
        for(FourTuple<Vehicle,Amphibian,String,Integer> i: tl)
            System.out.println(i);
    }
}
