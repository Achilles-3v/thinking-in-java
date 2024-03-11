package chapter15.generics;

import chapter15.generics.coffee.*;
import java.util.*;
import net.achilles.util.*;

interface Addable<T> { void add(T t); }

public class Fill2 {
}

class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }
    public void add(T item) { c.add(item); }
}
