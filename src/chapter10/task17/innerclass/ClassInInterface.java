package chapter10.task17.innerclass;

/**
 * Реализация окружающего интерфейса во внутреннем классе
 * @version 1.17 2023-12-27
 * @author Bruce Eckel
 */

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Hello");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
