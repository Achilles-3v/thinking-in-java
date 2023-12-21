package chapter08.task15.poly;

/**
 * Конструкторы и полиморфизм дают не тот
 * результат, который можно было бы ожидать
 * @version 1.15 2023-12-22
 * @author Bruce Eckel
 */

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
