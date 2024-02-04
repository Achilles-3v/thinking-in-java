package chapter14.typeinfo.task12;

import java.lang.reflect.*;

/**
 * Структура динамического заместителя
 * @version 14.12 2024-02-04
 * @author Bruce Eckel
 */

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println("  " + arg);
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {

}
