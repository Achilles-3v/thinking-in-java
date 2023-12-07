package chapter02.task06.storage;

public class Storage {

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println(storage(str));
    }

    static String storage(String string) {
        return string.length() * 2 + " byte";
    }
}
