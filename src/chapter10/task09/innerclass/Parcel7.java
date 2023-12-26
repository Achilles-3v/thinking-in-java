package chapter10.task09.innerclass;

/**
 * Возвращение экземпляра анонимного внутреннего класса
 * @version 1.9 2023-12-26
 * @author Bruce Eckel
 */

interface Contents {
    int value();
}

public class Parcel7 {

    public Contents contents() {
        return new Contents() {
            private int i = 11;
            public int value() { return i; }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
