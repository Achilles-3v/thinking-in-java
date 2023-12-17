package chapter05.task18.varArgs;

/**
 * Использование синтаксиса массивов для
 * получения переменного списка параметров
 * @version 1.18 2023-12-17
 * @author Brucr Eckel
 */

class A { int i; }

public class VarArgs {

    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        printArray(new Object[]{ 10, 14.6, 44.1 });
        printArray(new Object[]{ "one", "two", "three" });
        printArray(new Object[]{ new A(), new A(), new A() });

    }
}
