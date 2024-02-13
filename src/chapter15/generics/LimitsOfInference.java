package chapter15.generics;

import chapter14.typeinfo.pets.*;
import java.util.*;

/**
 * Произойдет ошибка
 * @version 15.10 2024-02-13
 * @author Bruce Eckel
 */
public class LimitsOfInference {
    static void
    f(Map<Person, List<? extends Pet>> petPeople) {}
    public static void main(String[] args) {
        // f(New.map()); // Does not compile
    }
}
