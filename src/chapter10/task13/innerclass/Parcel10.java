package chapter10.task13.innerclass;

/**
 * Использование "инициализации экземпляра" для выполнения
 * конструирования в анонимном внутреннем классе
 * @version 1.13 2023-12-27
 * @author Bruce Eckel
 */

interface Destination {
    String readLabel();
}

public class Parcel10 {

    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100)
                    System.out.println("Превышение бюджета");
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Танзания", 101.395F);
    }
}
