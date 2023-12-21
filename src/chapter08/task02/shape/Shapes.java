package chapter08.task02.shape;

/**
 * Полиморфные вызовы методов
 * @version 1.2 2023-12-21
 * @author Bruce Eckel
 */
public class Shapes {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shape shape: s)
            shape.draw();
    }
}
