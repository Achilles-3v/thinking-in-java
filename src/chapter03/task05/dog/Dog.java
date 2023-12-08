package chapter03.task05.dog;

public class Dog {

    String name, says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.says = "Gav";

        Dog scruffy = new Dog();
        scruffy.name = "Scruffy";
        scruffy.says = "Gav";

        System.out.println("name: " + spot.name + ", says: " + spot.says);

        spot.name = scruffy.name;
        System.out.println(spot.name == scruffy.name);
        System.out.println(spot.name.equals(scruffy.name));
        System.out.println(spot == scruffy);
        System.out.println(spot.says.equals(scruffy.says));
    }
}
