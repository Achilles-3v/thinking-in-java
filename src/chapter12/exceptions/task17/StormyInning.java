package chapter12.exceptions.task17;

/**
 * Переопределенные методы могут возбуждать только
 * исключения, описанные в версии базового класса,
 * или исключения, производного от исключений
 * базового класса.
 * @version 12.17 2024-01-21
 * @author Bruce Eckel
 */

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {} // Throws no checked exceptions
}

public class StormyInning {
}
