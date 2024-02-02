package chapter14.typeinfo.pets;

import java.util.*;

/**
 * Фасад для создания PetCreator по умолчанию
 * @version 14.38 2024-02-02
 * @author Bruce Eckel
 */
public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
