package chapter13.strings.task02;

/**
 * Оператор + для String
 * @version 13.02 2024-01-23
 * @author Bruce Eckel
 */
public class Concatenation {
    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }
}
