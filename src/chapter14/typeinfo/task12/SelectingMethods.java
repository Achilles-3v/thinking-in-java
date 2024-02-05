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

public class SelectingMethods  {
}
