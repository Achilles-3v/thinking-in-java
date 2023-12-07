package chapter02.task12.hellodate;
import java.util.Date;

/** Первая программа-пример книги.
 * Выводит строку и текущее число
 * @author Achilles-3v
 * @version 3.0
 */

public class HelloDate {

    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws Exception Исключения не выдаются
     */

    public static void main(String[] args) {
        System.out.println("Hello, now: ");
        System.out.println(new Date());
    }
}
