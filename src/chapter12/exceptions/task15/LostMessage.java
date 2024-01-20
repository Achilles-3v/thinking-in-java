package chapter12.exceptions.task15;

/**
 * Как можно потерять исключение
 * @version 12.15 2024-01-20
 * @author Bruce Eckel
 */

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {

}
