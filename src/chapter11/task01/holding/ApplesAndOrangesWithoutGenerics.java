package chapter11.task01.holding;

/**
 * Простой пример использования контейнера
 * (с предупреждением компилятора)
 * {ThrowsException}
 * @version 1.01 2023-12-31
 * @author Bruce Eckel
 */

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}

class Orange {}

public class ApplesAndOrangesWithoutGenerics {
}
