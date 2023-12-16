package chapter05.task09.flower;

/**
 * Демонстрируется использование ключевого слова
 * this, для вызова конструктора из другого конструктора
 * @version 1.9 2023-12-17
 * @author Bruce Eckel
 */
public class Flower {

    private int petalCounter = 0;
    private String text = "initial value";

    public Flower(int petalCounter) {
        this.petalCounter = petalCounter;
        System.out.println("Constructor with parameter int, petalCounter = " + this.petalCounter);
    }

    public Flower(String text) {
        this.text = text;
        System.out.println("Constructor with parameter String, text = " + this.text);
    }

    public Flower(String text, int petalCounter) {
        this(petalCounter);
        this.text = text;
        System.out.println("Arguments String and int");
    }

    public Flower() {
        this("Hello", 47);
        System.out.println("Default constructor. No arguments");
    }

    void printPetalCounter() {
        System.out.println("petalCounter = " + petalCounter + ", text = " + text);
    }

    public static void main(String[] args) {

        Flower x = new Flower();
        x.printPetalCounter();
    }
}
