package chapter12.exceptions.task5;

/**
 * Расширение функциональности классов исключений
 * @version 12.5 2024-01-17
 * @author Bruce Eckel
 */

class MyException2 extends Exception {
    private int x;
    public MyException2() {}
    public MyException2(String msg) { super(msg); }
    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }
    public int val() { return x; }
    public String getMessage() {
        return "Detail Message: "+ x + " "+ super.getMessage();
    }
}

public class ExtraFeatures {
}
