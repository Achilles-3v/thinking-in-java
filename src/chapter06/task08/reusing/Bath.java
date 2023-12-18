package chapter06.task08.reusing;

/**
 * Инициализация в конструкторе с композицией
 * @version 1.8 2023-12-18
 * @author Bruce Eckel
 */

class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }
    public String toString() { return s; }
}

public class Bath {

    private String
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Constructor Bath()");
        s3 = "Glad";
        toy = 3.14f;
        castille = new Soap();
    }

    { i = 47; }
    public String toString() {
        if (s4 == null)
            s4 = "Glad";
        return
                "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }

    public static void main(String[] args) {

        Bath b = new Bath();
        System.out.println(b);
    }
}
