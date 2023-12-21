package chapter08.task01.music;

public class Stringed extends Instrument{
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    String what() {return "Stringed"; }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
