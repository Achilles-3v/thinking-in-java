package chapter07.task01.reusing;

/**
 * Синтаксис наследования и его свойства
 * @version 1.1 2023-12-18
 * @author Bruce Eckel
 */

class Cleanser {

    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

public class Detergent extends Cleanser{

    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() { append(" foam()"); }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.print("base class: ");
        Cleanser.main(args);
    }
}

class MyTest extends Detergent {

    @Override
    public void scrub() {
        append(" MyTest.scrub()");
        super.scrub();
    }

    public void sterilize() { append(" sterilize()"); }

    public static void main(String[] args) {
        MyTest mt = new MyTest();
        mt.dilute();
        mt.apply();
        mt.scrub();
        mt.foam();
        mt.sterilize();
        System.out.println(mt);
        System.out.print("base class: ");
        Detergent.main(args);
    }
}
