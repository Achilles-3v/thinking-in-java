package chapter09.task20.interfaces;

/**
 * Система для настольных игр с использованием
 * "Фабричного метода"
 * @version 1.20 2023-12-24
 * @author Bruce Eckel
 */

interface Game { boolean move(); }
interface GameFactory { Game getGame(); }



public class Games {

    public static void main(String[] args) {


    }
}
