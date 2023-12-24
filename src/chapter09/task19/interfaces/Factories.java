package chapter09.task19.interfaces;

/**
 * В этой программе демонстрируется структура
 * паттерна "Фабричный метод"
 * @version 1.19 2023-12-24
 * @author Bruce Eckel
 */

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

public class Factories {

    public static void main(String[] args) {


    }
}
