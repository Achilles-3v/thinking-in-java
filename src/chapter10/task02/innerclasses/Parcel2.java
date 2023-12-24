package chapter10.task02.innerclasses;

import chapter10.task01.innerclasses.Parcel1;

/**
 * Возврат ссылки на внутренний класс
 * @version 1.2 2023-12-25
 * @author Bruce Eckel
 */

public class Parcel2 {

    class Contents {
        private int i = 11;
        public int value() { return i; }
    }

    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Транзакция");
        Parcel2 q = new Parcel2();
        // Определение ссылок на внутренние классы
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Борнео");
    }
}
