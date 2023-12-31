package chapter11.task01.holding;

import java.util.ArrayList;

/**
 * Использование обобщенных типов
 * @version 1.01 2023-12-31
 * @author Bruce Eckel
 */

public class ApplesAndOranges {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Ошибка во время компиляции
        // apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++)
            System.out.println((apples.get(i)).id());
        // Использование синтаксиса foreach
        for (Apple c : apples)
            System.out.println(c.id());
    }
}
