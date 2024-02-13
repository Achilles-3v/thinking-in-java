package chapter15.generics;

import chapter15.generics.coffee.*;
import java.util.*;
import net.achilles.util.*;

/**
 * Вспомогательный класс для работы с Generator
 * @version 15.12 2024-02-13
 * @author Bruce Eckel
 */
public class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }
}
