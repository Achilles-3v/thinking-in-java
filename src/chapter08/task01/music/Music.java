package chapter08.task01.music;

/**
 * Наследование и восходящее преобразование
 * @version 1.1 2023-12-21
 * @author Bruce Eckel
 */

public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        Stringed stringed = new Stringed();
        Brass brass = new Brass();

        tune(wind);
        tune(stringed);
        tune(brass);
    }
}
