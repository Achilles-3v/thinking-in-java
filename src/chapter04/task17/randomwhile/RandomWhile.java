package chapter04.task17.randomwhile;

import java.util.Random;

public class RandomWhile {

    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int a = random.nextInt(10);
            int b = random.nextInt(10);

            if (a > b) {
                System.out.println(a + " > " + b);
            }
            else if (a < b) {
                System.out.println(a + " < " + b);
            }
            else {
                System.out.println(a + " = " + b);
                break;
            }
        }
    }
}
