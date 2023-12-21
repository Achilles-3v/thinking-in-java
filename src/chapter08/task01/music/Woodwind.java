package chapter08.task01.music;

public class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }

    @Override
    String what() {return "Woodwind"; }
}
