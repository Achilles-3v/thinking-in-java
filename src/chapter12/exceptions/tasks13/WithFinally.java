package chapter12.exceptions.tasks13;

/**
 * Finally гарантирует выполнение завершающего кода
 * @version 12.13 2024-01-19
 * @author Bruce Eckel
 */
public class WithFinally {
    static Switch sw = new Switch();
    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            OnOffSwitch.f();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
