package chapter12.exceptions.task13;

/**
 * Предложение finally выполняется всегда
 * @version 12.13 2024-01-19
 * @author Bruce Eckel
 */
public class Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() { state = true;
        System.out.println(this); }
    public void off() { state = false;
        System.out.println(this); }
    public String toString() { return state ? "on" : "off"; }
}
