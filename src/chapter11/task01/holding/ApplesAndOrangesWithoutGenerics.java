package chapter11.task01.holding;

import java.util.ArrayList;

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
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Не мешает добавить Orange в apples
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++)
            ((Apple)apples.get(i)).id();
        // Объект Orange обнаруживается только во время выполнения
    }
}
