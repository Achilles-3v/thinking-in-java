package chapter13.strings.task21;

import java.util.*;

/**
 * Собственный ограничитель
 * @version 13.21 2024-01-27
 * @author Bruce Eckel
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while(scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }
}
