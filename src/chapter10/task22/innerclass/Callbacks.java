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

class MyIncrement {
    public void increment() {
        System.out.println("Другая операция");
    }

    public static void f(MyIncrement mi) { mi.increment(); }
}

// Если класс должен вызвать метод increment()
// по-другому, необходимо использовать внутренний класс:
class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {
        @Override
        public void increment() {
            // Указывает метод внешнего класса, иначе
            // возникает бесконечная рекурсия
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }
}

public class Callbacks {
}
