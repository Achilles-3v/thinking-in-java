package chapter10.task18.innerclass;

/**
 * Размещение тестового кода во вложенном классе
 * @version 1.18 2023-12-27
 * @author Bruce Eckel
 */

public class TestBed {
    public void f() {
        System.out.println("f()");
    }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
