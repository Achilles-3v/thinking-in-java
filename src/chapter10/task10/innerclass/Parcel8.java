package chapter10.task10.innerclass;

/**
 * Вызов конструктора базового класса
 * @version 1.10 2023-12-26
 * @author Bruce Eckel
 */

class Wrapping {
    int value;
    Wrapping(int value) {
        this.value = value;
    }
    int value() { return value; }
}

public class Parcel8 {

    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            // Передача аргумента конструктору
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
