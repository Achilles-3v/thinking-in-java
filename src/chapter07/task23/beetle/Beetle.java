package chapter07.task23.beetle;

/**
 * Полный процесс инициализации
 * @version 1.23 2023-12-20
 * @author Bruce Eckel
 */

class Insect {

    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 init");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {

    private int k = printInit("Beetle.k init");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 init");

    public static void main(String[] args) {
        System.out.println("Constructor Beetle");
        Beetle beetle = new Beetle();
    }
}
