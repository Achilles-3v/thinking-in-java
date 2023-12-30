package chapter10.task27.innerclass;

/**
 * Хранит последовательность объектов
 * @version 1.27 2023-12-30
 * @author Bruce Eckel
 */

interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        // Локальный внутренний класс
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    // То же с анонимным внутренним классом
    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {

    }
}
