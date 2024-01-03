package chapter11.task15.holding;

import java.util.*;

/**
 * Выводит все переменные окружения операционной системы
 * @version 1.15 2024-01-03
 * @author Bruce Eckel
 */

public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry: System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
