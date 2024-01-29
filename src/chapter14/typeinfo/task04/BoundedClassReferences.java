package chapter14.typeinfo.task04;

/**
 * @version 14.04 2024-01-29
 * @author Bruce Eckel
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number.
    }
}
