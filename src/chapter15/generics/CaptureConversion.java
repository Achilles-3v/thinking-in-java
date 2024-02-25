package chapter15.generics;

/**
 * Фиксация
 * @version 15.39 2024-02-25
 * @author Bruce Eckel
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }
    static void f2(Holder<?> holder) {
        f1(holder); // Call with captured type
    }
}
