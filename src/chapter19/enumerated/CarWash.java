package chapter19.enumerated;

import java.util.*;

public class CarWash {
    public enum Cycle {
        UNDERBODY {
            void action() {System.out.println("Spraying the underbody"); }
        },
        WHEELWASH {
            void action() { System.out.println("Washing the wheels"); }
        },
        PREWASH {
            void action() { System.out.println("Loosening the dirt"); }
        },
        BASIC {
            void action() { System.out.println("The basic wash"); }
        },
        HOTWAX {
            void action() { System.out.println("Applying hot wax"); }
        },
        RINSE {
            void action() { System.out.println("Rinsing"); }
        },
        BLOWDRY {
            void action() { System.out.println("Blowing dry"); }
        };
        abstract void action();
    }
    EnumSet<Cycle> cycles =
            EnumSet.of(Cycle.BASIC, Cycle.RINSE);
    public void add(Cycle cycle) { cycles.add(cycle); }
    public void washCar() {
        for(Cycle c : cycles)
            c.action();
    }
    public String toString() { return cycles.toString(); }
}
