package chapter03.task01.print;
import java.util.Date;

import static chapter03.task01.print.Print.print;

public class HelloDate {

    public static void main(String[] args) {
        print("Hello, now: ");
        print(new Date().toString());
    }
}
