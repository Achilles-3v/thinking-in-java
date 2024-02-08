package chapter14.typeinfo.task15;

import chapter14.typeinfo.interfacea.*;
import chapter14.typeinfo.packageaccess.*;
import java.lang.reflect.*;

/**
 * Неудачная попытка низходящего приобразования
 * @version 14.15 2024-02-08
 * @author Bruce Eckel
 */
public class HiddenImplementation {
    static void callHiddenMethod(Object a, String methodName)
            throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
