package chapter11.task09.holding;

import net.achilles.util.TextFile;

import java.util.*;

/**
 * Открыть и прочитать файл в Set
 * @version 1.09 2024-01-02
 * @author Bruce Eckel
 */

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                new TextFile("SetOperations.java", "\\W+")
        );
        System.out.println(words);
    }
}
