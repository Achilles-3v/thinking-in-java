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

    public void bark(int age) {
        this.age = age;
        System.out.println(name + " is " + this.age + " years old");
    }

    public void bark(double weight) {
        this.weight = weight;
        System.out.printf("%s weight %.2f kg\n", name, this.weight);
    }
}
