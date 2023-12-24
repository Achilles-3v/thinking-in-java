package chapter10.task04.innerclasses;

/**
 * Доступ к объекту внешнего класса
 * @version 1.4 2024-12-25
 * @author Bruce Eckel
 */

public class DotThis {

    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // this без уточнения соответствует объекту Inner
        }
    }

    public Inner inner() { return new Inner(); }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
