package chapter08.task01.music;

public class Wind extends Instrument{
    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    String what() {return "Wind"; }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
