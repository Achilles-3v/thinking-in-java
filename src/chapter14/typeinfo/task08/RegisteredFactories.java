package chapter14.typeinfo.task08;

import chapter14.typeinfo.factory.*;
import java.util.*;

/**
 * Регистрация фабрик класса в базовом классе
 * @version 14.08 2024-02-03
 * @author Bruce Eckel
 */

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactories =
            new ArrayList<Factory<? extends Part>>();

    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    // Create a Class Factory for each specific type:
    public static class Factory
            implements typeinfo.factory.Factory<FuelFilter> {
        public FuelFilter create() { return new FuelFilter(); }
    }
}

public class RegisteredFactories {
}
