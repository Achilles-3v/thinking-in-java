package chapter07.task15.orc;
import chapter07.task15.villain.Villain;

/**
 * Получение доступа к полям класса в другом
 * пакете, через ключевое слово protected
 * @version 1.15 2023-12-20
 * @author Bruce Eckel
 */

public class Orc extends Villain{

    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Tommy", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
