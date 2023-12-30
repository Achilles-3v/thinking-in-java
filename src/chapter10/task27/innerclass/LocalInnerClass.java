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
                System.out.print(name);
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
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Локальный"),
                c2 = lic.getCounter2("Анонимный");
        for (int i = 0; i < 5; i++)
            System.out.println(c1.next());
        for (int i = 0; i < 5; i++)
            System.out.println(c2.next());
    }
}
