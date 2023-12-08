package chapter04.task18.primenumber;

public class PrimeNumber {

    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            int count = 0;

            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
