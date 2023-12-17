package chapter05.task13.mugs;

/**
 * В этой программе демонстрируются разные
 * способы инициализации полей класса
 * @version 1.13 2023-12-17
 * @author Bruce Eckel
 */
public class Mugs {

    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 and mug2 initialization");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {

        System.out.println("In method main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
