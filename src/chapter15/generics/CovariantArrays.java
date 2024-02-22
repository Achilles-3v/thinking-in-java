package chapter15.generics;

/**
 * Массив производного типа можно присвоить
 * ссылке на массив базового типа
 * @version 15.30 2024-02-22
 * @author Bruce Eckel
 */

class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class CovariantArrays {
}
