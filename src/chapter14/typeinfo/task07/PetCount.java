package chapter14.typeinfo.task07;

import chapter14.typeinfo.pets.*;
import java.util.*;

/**
 * Подсчет объектов Pet
 * @version 14.07 2024-02-02
 * @author Bruce Eckel
 */
public class PetCount {
    static class PetCounter extends HashMap<String,Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if(quantity == null)
                put(type, 1);
            else
                put(type, quantity + 1);
        }
    }
}
