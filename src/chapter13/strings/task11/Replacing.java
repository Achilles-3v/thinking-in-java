package chapter13.strings.task11;

/**
 * Иструмент String - замена
 * @version 13.11 2024-01-25
 * @author Bruce Eckel
 */
public class Replacing {
    static String s = Splitting.knights;
    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
    }
}
