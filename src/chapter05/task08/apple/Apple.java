package chapter05.task08.apple;

/**
 * В этой программе демонстрируется возможное,
 * но не желательное использование ключевого
 * слова this
 * @version 1.8 2023-12-17
 * @author Achilles
 */
public class Apple {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.peel();
    }

    void peel() {
        Apple ap = peelPrint(new Apple());
        ap.peelPrint(this);
    }

    Apple peelPrint(Apple apple) {
        System.out.println("Yummy");
        return this;
    }
}
