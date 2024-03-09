package chapter15.generics;

import java.lang.reflect.*;

// Does not implement Performs:
class Mime {
    public void walkAgainstTheWind() {}
    public void sit() {
        System.out.println("Pretending to sit"); }
    public void pushInvisibleWalls() {}
    public String toString() { return "Mime"; }
}

// Does not implement Performs:
class SmartDog {
    public void speak() {
        System.out.println("Woof!"); }
    public void sit() {
        System.out.println("Sitting"); }
    public void reproduce() {}
}

public class LatentReflection {
}
