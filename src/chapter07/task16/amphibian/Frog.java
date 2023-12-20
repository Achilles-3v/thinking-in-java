package chapter07.task16.amphibian;

/**
 * В этой программе демонстрируется
 * восходящее преобразование типов
 * @version 1.16 2023-12-20
 * @author Achilles
 */

public class Frog extends Amphibian{

    public Frog(String name) {
        super(name);
    }
    public void regeneration() {
        System.out.println("regeneration Frog");
    }

    public static void main(String[] args) {
        Frog frog = new Frog("Crazy");
        System.out.println(frog);
        frog.set("Ozzy", 12.2);
        System.out.println(frog);
        frog.regeneration();
        Amphibian.say(frog); // Восходящее преобразование
    }
}
