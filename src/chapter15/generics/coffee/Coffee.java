package chapter15.generics.coffee;

/**
 * @version 15.07 2024-02-11
 * @author Bruce Eckel
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
