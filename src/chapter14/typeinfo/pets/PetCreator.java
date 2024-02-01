package chapter14.typeinfo.pets;

import java.util.*;

/**
 * Создание разных объектов, производных от Pet
 * @version 14.44 2024-02-01
 * @author Bruce Eckel
 */
public abstract class PetCreator {
    private Random rand = new Random(47);
    // The List of the different types of Pet to create:
    public abstract List<Class<? extends Pet>> types();
}
