package chapter13.strings.task12;

/**
 * Совподение символов
 * @version 13.12 2024-01-25
 * @author Bruce Eckel
 */
public class Rudolph {
    public static void main(String[] args) {
        for(String pattern : new String[]{ "Rudolph",
                "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*" })
            System.out.println("Rudolph".matches(pattern));
    }
}
