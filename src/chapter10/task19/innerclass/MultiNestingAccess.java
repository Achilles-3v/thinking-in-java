package chapter10.task19.innerclass;

/**
 * Вложенные классы могут обращаться ко всем членам
 * всех уровней классов, в которые они вложены
 * @version 1.19 2023-12-27
 * @author Bruce Eckel
 */

class MNA {
    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {

    public static void main(String[] args) {

        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
