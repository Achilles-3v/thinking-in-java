package chapter10.task11.innerclass;

/**
 * Анонимный внутренний класс, выполняющий инициализацию
 * @version 1.9 2023-12-26
 * @author Bruce Eckel
 */

interface Destination {
    String readLabel();
}

public class Parcel9 {

    // Для использования анонимном внутреннем классе
    // аргумент должен быть объявлен как final

    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Танзания");
    }
}
