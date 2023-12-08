package chapter04.task20.ifelse;

public class IfElse {

    public static void main(String[] args) {

        System.out.println(test(6, 6, 1, 10));
        test(5, 5, 1,3);
    }

    public static int test(int value, int target, int begin, int end) {
        if (value >= begin && value <= end) {
            if (value > target)
                return +1;
            else if (value < target)
                return -1;
            else
                return 0;
        }
        System.out.println("Not included in range");
        return 0;
    }
}
