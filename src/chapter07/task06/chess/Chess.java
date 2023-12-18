package chapter07.task06.chess;

/**
 * Наследование, конструкторы и аргументы
 * @version 1.6 2023-12-19
 * @author Bruce Eckel
 */

class Game {
    Game(int i) {
        System.out.println("Constructor Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("Constructor BoardGame");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Constructor Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
