package chapter14.typeinfo.task04;

/**
 * @version 14.04 2024-01-29
 * @author Bruce Eckel
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
