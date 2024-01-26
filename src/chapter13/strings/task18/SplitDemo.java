package chapter13.strings.task18;

import java.util.regex.*;
import java.util.*;

/**
 * Разбиение входного текста по общему разделителю
 * @version 13.18 2024-01-26
 * @author Bruce Eckel
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // Only do the first three:
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }
}
