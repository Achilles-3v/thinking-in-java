package chapter03.task07.coin;
import java.util.Random;
import java.util.Scanner;

public class Coin {

    static int eagle = 0;
    static int tails = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean coin;
        String enter = "";

        while (!enter.equals("0")) {
            System.out.print("Pleas, enter: ");
            enter = scanner.nextLine();

            coin = random.nextBoolean();
            if (coin) {
                System.out.println("Eagle");
                eagle++;
            }
            else {
                System.out.println("Tails");
                tails++;
            }
            System.out.println("eagle: " + eagle + ", tails: " + tails);
        }
    }
}
