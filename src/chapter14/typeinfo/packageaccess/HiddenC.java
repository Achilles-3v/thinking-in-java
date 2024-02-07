package chapter14.typeinfo.packageaccess;

import chapter14.typeinfo.interfacea.*;

/**
 * Доступ на уровне пакета
 * @version 14.34 2024-02-07
 * @author Bruce Eckel
 */
class C implements A {
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
}

public class HiddenC {
    public static A makeA() { return new C(); }
}
