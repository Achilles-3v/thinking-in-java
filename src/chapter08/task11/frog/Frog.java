package chapter08.task11.frog;

/**
 * Наследование и завершающие действия
 * @version 1.11 2023-12-21
 * @author Bruce Eckel
 */

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Created Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("Cansel Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Created Description " + s);
    }

    protected void dispose() {
        System.out.println("Cansel Description " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("Живое существо");
    private Description t = new Description("Обычное живое существо");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("dispose() in LivingCreature");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("Имеет сердце");
    private Description t = new Description("Животное, не растение");

    Animal() {
        System.out.println("Animal");
    }

    protected void dispose() {
        System.out.println("dispose() in Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("Может жить в воде");
    private Description t = new Description("и в воде, и на земле");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("dispose() in Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Квакает");
    private Description t = new Description("Ест жуков");

    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("Cansel Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Good Bay");
        frog.dispose();
    }
}
