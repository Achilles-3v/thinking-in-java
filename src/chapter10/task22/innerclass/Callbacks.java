package chapter10.task22.innerclass;

/**
 * Использование внутренних классов
 * для реализации внутренних вызовов
 * @version 1.22 2023-12-28
 * @author Bruce Eckel
 */

interface Incrementable {
    void increment();
}

// Просто реализуем интерфейс
class Callee1 implements Incrementable {
    private int i = 0;
    public void increment() {
        i++;
        System.out.println(i);
    }
}

public class Callbacks {
}
