package chapter10.task21.innerclass;

/**
 * При использовании конкретных или абстрактных классов
 * внутренние классы предоставляют едиственный способ
 * провести "множественное наследование реализации"
 * @version 1.21 2023-12-23
 * @author Bruce Eckel
 */

class D {}
abstract class E {}

class Z extends D {
    E makeE() { return new E() {}; }
}

public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
