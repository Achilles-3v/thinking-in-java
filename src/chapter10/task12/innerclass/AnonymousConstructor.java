package chapter10.task12.innerclass;

/**
 * Создание конструктора для анонимного
 * внутреннего класса
 * @version 1.12 2023-12-26
 * @author Bruce Eckel
 */

abstract class Base {
    public Base(int i) {
        System.out.println("Базовый конструктор, i = " + i);
    }
    public abstract void f();
}

public class AnonymousConstructor {

    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("В инициализаторе экземпляра");
            }
            @Override
            public void f() {
                System.out.println("В анонимном f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
