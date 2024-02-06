package chapter14.typeinfo.task13;

import java.util.*;

/**
 * Класс с null-объектом
 * @version 14.13 2024-02-06
 * @author Bruce Eckel
 */
public class Staff extends ArrayList<Position> {
    public void add(String title, Person person) {
        add(new Position(title, person));
    }
    public void add(String... titles) {
        for(String title : titles)
            add(new Position(title));
    }
}
