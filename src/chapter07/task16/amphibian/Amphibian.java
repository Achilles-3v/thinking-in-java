package chapter07.task16.amphibian;

public class Amphibian {

    private String name;
    private double weight;

    public Amphibian(String name) {
        this.name = name;
        this.weight = 0.0;
    }

    protected void set(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weight " + weight + " kg";
    }

    public void swim() {
        System.out.println(name + " swims");
    }
    public void regeneration() {
        System.out.println("regeneration Amphibian");
    }
    static void say(Amphibian amphibian) {
        amphibian.swim();
    }
}
