package chapter05.task02.simpleConstructor;

/**
 * В этой программе демонстрируется отличия переменных
 * инициализируемых в разных местах
 * @version 1.1 2023-12-16
 * @author Achilles
 */
public class SimpleConstructor {

    public static void main(String[] args) {

        Simple sm = new Simple();
        System.out.println(sm.toString());

        Simple sp = new Simple("Petr", "Petrov");
        System.out.println(sp.toString());
    }
}

class Simple {

    private String firstName;
    private String secondName = "Ivanov";

    public Simple() {
    }

    public Simple(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}