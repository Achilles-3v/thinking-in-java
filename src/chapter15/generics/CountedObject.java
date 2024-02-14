package chapter15.generics;

/**
 * Простой класс, конструктор по умолчанию
 * @version 15.14 2024-02-14
 * @author Bruce Eckel
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }
    public String toString() { return "CountedObject " + id;}
}
