package chapter11.task06.holding;

import java.util.*;

/**
 * Класс заполняющий список
 * @version 1.06 2024-01-01
 * @author Achilles
 */

public class Pet {
    static Collection iterator(Collection<String> collection) {
        collection.add("Rat");
        collection.add("Manx");
        collection.add("Cymric");
        collection.add("Mutt");
        collection.add("Pug");
        collection.add("Cymtic");
        collection.add("Mau");
        collection.add("EgyptianMau");
        collection.add("Mutt");
        collection.add("Pug");
        collection.add("Hamster");
        collection.add("Rat");
        return collection;
    }
}
