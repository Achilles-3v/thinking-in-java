package chapter12.exceptions.task16;

/**
 * Как можно потерять исключение
 * @version 12.16 2024-01-20
 * @author Bruce Eckel
 */
public class ExceptionSilenser {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block
            // will silence any thrown exception.
            return;
        }
    }
}
