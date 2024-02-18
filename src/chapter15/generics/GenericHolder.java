package chapter15.generics;

/**
 * Поддержка обобщений
 * @version 15.20 2024-02-18
 * @author Bruce Eckel
 */
public class GenericHolder<T> {
    private T obj;
    public void set(T obj) { this.obj = obj; }
    public T get() { return obj; }
    public static void main(String[] args) {
        GenericHolder<String> holder =
                new GenericHolder<String>();
        holder.set("Item");
        String s = holder.get();
    }
}
