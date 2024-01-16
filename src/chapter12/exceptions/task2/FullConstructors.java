package chapter12.exceptions.task2;

/**
 * Класс исключения с конструктором
 * @version 12.2 2024-01-16
 * @author Bruce Eckel
 */
class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) { super(msg); }
}

public class FullConstructors {
}
