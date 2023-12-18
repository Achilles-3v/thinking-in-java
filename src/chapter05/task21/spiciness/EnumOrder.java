package chapter05.task21.spiciness;

/**
 * В этой программе демонстрируется работа
 * с перечислимыми типами данных
 * @version 1.21 2023-12-18
 * @author Bruce Eckel
 */
public class EnumOrder {

    public static void main(String[] args) {

        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
