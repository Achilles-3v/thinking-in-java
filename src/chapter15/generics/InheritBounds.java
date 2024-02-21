package chapter15.generics;

/**
 * @version 15.28 2024-02-21
 * @author Bruce Eckel
 */

class HoldItem<T> {
    T item;
    HoldItem(T item) { this.item = item; }
    T getItem() { return item; }
}

class Colored2<T extends HasColor> extends HoldItem<T> {
    Colored2(T item) { super(item); }
    java.awt.Color color() { return item.getColor(); }
}

public class InheritBounds {
}
