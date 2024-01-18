package chapter12.exceptions.task9;

/**
 * Демонстрация fillInStackTrace()
 * @version 12.8 2024-01-17
 * @author Bruce Eckel
 */

class OneException extends Exception {
    public OneException(String s) { super(s); }
}

class TwoException extends Exception {
    public TwoException(String s) { super(s); }
}

public class RethrowNew {

}
