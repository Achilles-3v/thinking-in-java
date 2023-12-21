package chapter08.task01.music;

public class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play()" + note);
    }

    String what() {return "Instrument"; }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
