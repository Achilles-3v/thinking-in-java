package chapter04.task15.counter;

public class Counter {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int c = i + 1;
            if((c % 2) == 0)
                System.out.println("i = " + c);
        }
    }
}
