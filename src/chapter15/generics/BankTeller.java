package chapter15.generics;

import java.util.*;
import net.achilles.util.*;

/**
 * Очень простая модель кассира
 * @version 15.19 2024-02-15
 * @author Bruce Eckel
 */

class Customer {
    private static long counter = 1;
    private final long id = counter++;
    private Customer() {}
    public String toString() { return "Customer " + id; }
    // A method to produce Generator objects:
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            public Customer next() { return new Customer(); }
        };
    }
}

class Teller {
    private static long counter = 1;
    private final long id = counter++;
    private Teller() {}
    public String toString() { return "Teller " + id; }
    // A single Generator object:
    public static Generator<Teller> generator =
            new Generator<Teller>() {
                public Teller next() { return new Teller(); }
            };
}

public class BankTeller {
}
