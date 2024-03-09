package chapter15.generics;

import chapter14.typeinfo.pets.*;

class PerformingDog extends Dog implements Performs {
    public void speak() {
        System.out.println("Woof!"); }
    public void sit() {
        System.out.println("Sitting"); }
    public void reproduce() {}
}

public class DogsAndRobots {
}
