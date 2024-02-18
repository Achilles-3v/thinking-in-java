package chapter15.generics;

/**
 * @version 15.21 2024-02-18
 * @author Bruce Eckel
 */
class Building {}
class House extends Building {}

public class ClassTypeCapture<T> {
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }
}
