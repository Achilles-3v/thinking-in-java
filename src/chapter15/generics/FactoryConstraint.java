package chapter15.generics;

/**
 * Явная фабрика с ограниченным типом
 * @version 15.23 2024-02-19
 * @author Bruce Eckel
 */

interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
    // ...
}

public class FactoryConstraint {
}
