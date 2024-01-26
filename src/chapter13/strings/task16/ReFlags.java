package chapter13.strings.task16;

import java.util.regex.*;

/**
 * Объединение флагов опирацией ИЛИ ||
 * @version 13.16 2024-01-26
 * @author Bruce Eckel
 */
public class ReFlags {
    public static void main(String[] args) {
        Pattern p =  Pattern.compile("^java",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has regex\nJava has regex\n" +
                        "JAVA has pretty good regular expressions\n" +
                        "Regular expressions are in Java");
        while(m.find())
            System.out.println(m.group());
    }
}
