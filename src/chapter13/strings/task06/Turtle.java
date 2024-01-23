package chapter13.strings.task06;

import java.io.*;
import java.util.*;

/**
 * Класс Formatter
 * @version 13.05 2024-01-23
 * @author Bruce Eckel
 */
public class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }
}
