package chapter07.task15.villain;

/**
 * Ключевое слово protected
 */

public class Villain {
    private String name;
    protected void set(String nm) { name = nm; }
    public Villain(String name) {
        this.name = name;
    }
    public String toString() {
        return "I am object Villain and my name is " + name;
    }
}
