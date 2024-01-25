package chapter13.strings.task14;

import java.util.regex.*;

/**
 * Поиск множественных совподений шаблона в объекте
 * @version 13.14 2024-01-25
 * @author Bruce Eckel
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening is full of the linnet's wings");
        while(m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        int i = 0;
        while(m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }
    }
}
