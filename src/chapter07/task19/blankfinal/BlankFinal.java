package chapter07.task19.blankfinal;

/**
 * "Пустые" неизменные поля
 * @version 1.19 2023-12-20
 * @author Bruce Eckel
 */

class Poppet {
    private int i;
    Poppet(int ii) {
        i = ii;
        System.out.println("Constructor Poppet()");
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
        System.out.println("Constructor BlankFinal()");
    }
    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
        System.out.println("Constructor BlankFinal(int)");
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
