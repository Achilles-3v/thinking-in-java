package chapter02.task07.incrementable;

public class Incrementable {

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        StaticTest test2 = new StaticTest();

        StaticTest.counter++;
        System.out.println(test.counter + "\n" + test2.counter);

        increment();
        System.out.println(StaticTest.counter);
    }

    static void increment() {
        StaticTest.counter++;
    }
}
