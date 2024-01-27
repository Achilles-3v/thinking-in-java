package chapter14.typeinfo.task01;

import java.util.*;

/**
 * Реализация иерархии Shape
 * @version 14.01 2024-01-27
 * @author Bruce Eckel
 */

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

public class Shapes {

}
