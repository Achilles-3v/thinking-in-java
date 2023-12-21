package chapter08.task01.music;

/**
 * Работа метода не зависит от фактического типа
 * объекта, поэтому типы, добавленные в систему,
 * будут работать правильно
 * @version 1.5 2023-12-21
 * @author Bruce Eckel
 */

public class Music3 {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i: e)
            tune(i);
    }

    public static void main(String[] args) {

        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}
