package chapter09.task14.interfaces;

import java.nio.*;
import java.util.*;

/**
 * Реализация интерфейса для выполнения требований метода
 * @version 1.14 2023-12-23
 * @author Bruce Eckel
 */

public class RandomWords implements Readable {

    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) { this.count = count; }

    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1; // Признак конца входных данных
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(new RandomWords(10));
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}
