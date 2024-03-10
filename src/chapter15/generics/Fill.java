package chapter15.generics;

import java.util.*;

public class Fill {
    public static <T> void fill(Collection<T> collection,
                                Class<? extends T> classToken, int size) {
        for(int i = 0; i < size; i++)
            // Assumes default constructor:
            try {
                collection.add(classToken.newInstance());
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
    }
}


