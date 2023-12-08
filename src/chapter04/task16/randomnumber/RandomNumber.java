package chapter04.task16.randomnumber;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
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
            }
        }
    }
}
