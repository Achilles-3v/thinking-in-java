package chapter06.task1.range;

import java.util.Arrays;
import static net.achilles.util.Range.range;

public class RangeTest {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(range(10)));
        System.out.println(Arrays.toString(range(10, 20)));
        System.out.println(Arrays.toString(range(10, 50, 4)));
    }
}
