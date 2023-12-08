package chapter03.task03.passobject;

public class PassObject {

    public static void main(String[] args) {
        Letter x = new Letter();
        x.value = 4;
        System.out.println("x.value: " + x.value);
        f(x);
        System.out.println("x.value: " + x.value);
    }

    static void f(Letter y) {
        y.value = 6;
    }
}
