package chapter15.generics;

/**
 * Использование параметр-тип в списке аргументов
 * @version 15.32 2024-02-22
 * @author Bruce Eckel
 */
public class Holder<T> {
    private T value;
    public Holder() {}
    public Holder(T val) { value = val; }
    public void set(T val) { value = val; }
    public T get() { return value; }
    public boolean equals(Object obj) {
        return value.equals(obj);
    }
}
