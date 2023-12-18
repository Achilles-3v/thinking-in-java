package chapter06.task06.reusing;

/**
 * Композиция для повторного использования кода
 * @version 1.6 2023-12-18
 * @author Bruce Eckel
 */

class WaterSource {

    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "designed";
    }
    public String toString() { return s; }
}

public class SprinklerSystem {

    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return
                "valve1 = " + valve1 + ", " +
                "valve2 = " + valve2 + ", " +
                "valve3 = " + valve3 + ", " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + ", " + "f = " + f +
                ", " + "source = " + source;
    }

    public static void main(String[] args) {

        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
