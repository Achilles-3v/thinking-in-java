package chapter07.task22.jurassic;

/**
 * Объявление неизменным всего класса
 * @version 1.22 2023-12-20
 * @author Bruce Eckel
 */

class SmallBrain {}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() {}
}

//! class Further extends Dinosaur {}
// Ошибка: Нельзя расширять неизменный класс

public class Jurassic {

    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.f();
        dinosaur.i = 40;
        dinosaur.j++;
    }
}
