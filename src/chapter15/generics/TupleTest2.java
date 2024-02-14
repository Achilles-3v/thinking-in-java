package chapter15.generics;

import net.achilles.util.*;
import static net.achilles.util.Tuple.*;

/**
 * Модифицированная версия
 * @version 15.16 2024-02-14
 * @author Bruce Eckel
 */
public class TupleTest2 {
    static TwoTuple<String,Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() { return tuple("hi", 47); }
    static ThreeTuple<Amphibian,String,Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }
}
