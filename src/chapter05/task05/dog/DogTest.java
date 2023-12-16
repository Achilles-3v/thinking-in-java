package chapter05.task05.dog;

/**
 * В этой программе демонстрируется перегрузка
 * методов, а так же с одинаковой сигнатурой,
 * но разной последовательностью.
 * @version 1.5 2023-12-16
 * @author Achilles
 */
public class DogTest {

    public static void main(String[] args) {

        Dog bob = new Dog();
        Dog chack = new Dog("Chack", 12, 23);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        bob.bark("Hello");
        System.out.println(chack.toString());
        dog1.bark(15, 24.0);
        dog2.bark(34.5, 12);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

    }
}
