package chapter14.typeinfo.task12;

import java.lang.reflect.*;

/**
 * Поиск конкретных методов в динамическом заместителе
 * @version 14.12 2024-02-05
 * @author Bruce Eckel
 */

class MethodSelector implements InvocationHandler {
    private Object proxied;
    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        if(method.getName().equals("interesting"))
            System.out.println("Proxy detected the interesting method");
        return method.invoke(proxied, args);
    }
}

interface SomeMethods {
    void boring1();
    void boring2();
    void interesting(String arg);
    void boring3();
}

class Implementation implements SomeMethods {
    public void boring1() {
        System.out.println("boring1"); }
    public void boring2() {
        System.out.println("boring2"); }
    public void interesting(String arg) {
        System.out.println("interesting " + arg);
    }
    public void boring3() {
        System.out.println("boring3"); }
}

public class SelectingMethods  {
}
