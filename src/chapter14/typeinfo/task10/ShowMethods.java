package chapter14.typeinfo.task10;

import java.lang.reflect.*;
import java.util.regex.*;

/**
 * Использование отражения для вывода на экран
 * всех методов класса, включая те, что были
 * определены в базовых классах
 * @version 14.10 2024-02-04
 * @author Bruce Eckel
 */
public class ShowMethods {
    private static String usage =
            "usage:\n" +
                    "ShowMethods qualified.class.name\n" +
                    "To show all methods in class or:\n" +
                    "ShowMethods qualified.class.name word\n" +
                    "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");
}
