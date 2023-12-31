package chapter11.task01.holding;

import java.util.ArrayList;

/**
 * Восходящее преобразование обобщенных типов
 * @version 1.02 2023-12-31
 * @author Bruce Eckel
 */

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples)
            System.out.println(c);
    }
}
