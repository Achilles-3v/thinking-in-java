package chapter05.task16.dynamicArray;

/**
 * В этой программе демонстрируется передача
 * массива из одного метода main в другой
 * метод main
 * @version 1.16 2023-12-17
 * @author Bruce Eckel
 */
public class DynamicArray {

    public static void main(String[] args) {

        Other.main(new String[] { "one", "two", "three", "four"});
    }
}

class Other {

    public static void main(String[] args) {

        for (String s : args) {
            System.out.print(s + " ");
        }
    }
}
