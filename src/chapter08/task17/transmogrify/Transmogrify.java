package chapter08.task17.transmogrify;

/**
 * Динамическое изменение поведения объекта
 * с помощью композиции (паттерн "Состояние")
 * @version 1.17 2023-12-22
 * @author Bruce Eckel
 */

class Actor {
    public void act() {}
}

class HappyActor extends Actor{
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() { actor = new SadActor(); }
    public void performPlay() { actor.act(); }
}

public class Transmogrify {

    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
