package chapter14.typeinfo.task15;

import chapter14.typeinfo.interfacea.*;

/**
 * Анонимные внутренние классы не скрыты от отражения
 * @version 14.15 2024-02-08
 * @author Bruce Eckel
 */

class AnonymousA {
    public static A makeA() {
        return new A() {
            public void f() {
                System.out.println("public C.f()"); }
            public void g() {
                System.out.println("public C.g()"); }
            void u() {
                System.out.println("package C.u()"); }
            protected void v() {
                System.out.println("protected C.v()"); }
            private void w() {
                System.out.println("private C.w()"); }
        };
    }
}

public class AnonymousImplementation {
}
