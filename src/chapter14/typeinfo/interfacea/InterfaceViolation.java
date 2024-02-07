package chapter14.typeinfo.interfacea;

/**
 * Программирование в обход интерфейса
 * @version 14.15 2024-02-07
 * @author Bruce Eckel
 */

class B implements A {
    public void f() {}
    public void g() {}
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // Compile error
        System.out.println(a.getClass().getName());
        if(a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
}
