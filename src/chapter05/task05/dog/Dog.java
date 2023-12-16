package chapter05.task05.dog;

public class Dog {

    private String name;
    private int age;
    private double weight;

    public Dog() {
        this.name = "Bob";
    }

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public void bark(String word) {
        System.out.println(name + " says " + word);
    }

    public void bark(int age, double weight) {
        this.age = age;
        this.weight = weight;
        System.out.println(name + " is " + this.age + " years old");
        System.out.printf("%s weight %.2f kg\n", name, this.weight);
    }

    public void bark(double weight, int age) {
        this.weight = weight;
        this.age = age;
        System.out.printf("%s weight %.2f kg\n", name, this.weight);
        System.out.println(name + " is " + this.age + " years old");
    }
}
