package chapter15.generics;

/**
 * Изучение смысла масок
 * @version 15.38 2024-02-24
 * @author Bruce Eckel
 */
public class Wildcards {
    static void rawArgs(Holder holder, Object arg) {
        Object obj = holder.get();
    }
    static void unboundedArg(Holder<?> holder, Object arg) {
        Object obj = holder.get();
    }
    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }
    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }
    static <T>
    T wildSubtype(Holder<? extends T> holder, T arg) {
        T t = holder.get();
        return t;
    }
    static <T>
    void wildSupertype(Holder<? super T> holder, T arg) {
        holder.set(arg);
        Object obj = holder.get();
    }
}
