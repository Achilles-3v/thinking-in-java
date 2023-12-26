package chapter10.task09.innerclass;

/**
 * Расширенная версия Parcel7
 * @version 2.9 2023-12-26
 * @author Bruce Eckel
 */

public class Parcel7b {

    class MyContents implements Contents {
        private int i;
        public int value() { return i; }
    }

    public Contents contents() { return new MyContents(); }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
