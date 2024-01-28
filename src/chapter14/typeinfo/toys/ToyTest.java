package chapter14.typeinfo.toys;

/**
 * Тестирование класса Class
 * @version 14.03 2024-01-28
 * @author Bruce Eckel
 */

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1); }
}

public class ToyTest {
}
