package chapter12.exceptions.task11;

/**
 * Игнорирование исключений RuntimeException
 * @version 12.11 2024-01-19
 * @author Bruce Eckel
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }
    static void g() {
        f();
    }
    public static void main(String[] args) {
        g();
    }
}
