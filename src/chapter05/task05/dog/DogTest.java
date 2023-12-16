package chapter05.task05.dog;

public class DogTest {

    public static void main(String[] args) {

        Dog bob = new Dog();
        Dog chack = new Dog("Chack", 12, 23);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        bob.bark("Hello");
        System.out.println(chack.toString());
        dog1.bark(15);
        dog2.bark(34.5);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

    }
}
