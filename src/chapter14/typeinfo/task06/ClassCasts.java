package chapter14.typeinfo.task06;

/**
 * Привидения типов для ссылок на Class
 * @version 14.06 2024-01-30
 * @author Bruce Eckel
 */

class Building {}
class House extends Building {}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b; // ... or just do this.
    }
}
