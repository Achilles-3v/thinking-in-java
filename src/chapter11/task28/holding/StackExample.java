package chapter11.task28.holding;

/**
 * LIFO Последний зашел первый вышел
 * @version 1.28
 * @author Achilles
 */
public class StackExample {
    static void abc1() {
        System.out.println("abc1 starts");
        System.out.println("abc1 end");
    }

    static void abc2() {
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 end");
    }

    static void abc3() {
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 end");
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        abc3();
        System.out.println("main end");
    }
}
