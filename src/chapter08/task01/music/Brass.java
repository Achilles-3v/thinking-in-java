package chapter08.task01.music;

public class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    String what() {return "Brass"; }
}
