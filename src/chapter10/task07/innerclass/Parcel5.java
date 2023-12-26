package chapter10.task07.innerclass;

/**
 * Вложение класса в метод
 * Локальный внутренний класс
 * @version 1.7 2023-12-26
 * @author Bruce Eckel
 */

interface Destination {
    String readLabel();
}

public class Parcel5 {

    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {

        Parcel5 p = new Parcel5();
        Destination d = p.destination("Танзания");
    }
}
