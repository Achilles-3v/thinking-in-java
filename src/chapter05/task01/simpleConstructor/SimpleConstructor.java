package chapter05.task01.simpleConstructor;

/**
 * В этой программе демонстрируется как
 * Java инициализирует ссылку значением null
 * @version 1.0 2023-12-16
 * @author Achilles
 */
public class SimpleConstructor {

    public static void main(String[] args) {
        Simple sp = new Simple();
        System.out.println(sp.getName());

        Simple sm = new Simple("Bob");
        System.out.println(sm.getName());
    }
}

class Simple {
    private String name;

    public Simple() {}

    public Simple (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}