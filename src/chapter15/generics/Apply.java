package chapter15.generics;

import java.lang.reflect.*;
import java.util.*;

public class Apply {
}

class Shape {
    public void rotate() {
        System.out.println(this + " rotate"); }
    public void resize(int newSize) {
        System.out.println(this + " resize " + newSize);
    }
}

class Square extends Shape {}

class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size) {
        try {
            for(int i = 0; i < size; i++)
                // Assumes default constructor:
                add(type.newInstance());
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
