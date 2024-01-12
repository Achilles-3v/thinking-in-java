package chapter11.list_interface;

import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>(100);

        for (int i = 1; i <= 100; i++) {
            lottery.add(i);     //добавляем в барабан числа от 1 до 100
        }

        Collections.shuffle(lottery);       //перемешиваем

        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");

        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i));
        }
    }
}
