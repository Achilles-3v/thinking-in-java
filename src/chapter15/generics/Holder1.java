package chapter15.generics;

/**
 * Класс преднозначенный для хранения одного объекта
 * @version 15.01 2024-02-09
 * @author Bruce Eckel
 */

class Automobile {}

public class Holder1 {
    private Automobile a;
    public Holder1(Automobile a) { this.a = a; }
    Automobile get() { return a; }
}
