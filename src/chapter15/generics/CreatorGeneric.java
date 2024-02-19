package chapter15.generics;

/**
 * Шаблонный метод
 * @version 15.23 2024-02-19
 * @author Bruce Eckel
 */

abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate() { element = create(); }
    abstract T create();
}

class X {}

class Creator extends GenericWithCreate<X> {
    X create() { return new X(); }
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}

public class CreatorGeneric {
}
