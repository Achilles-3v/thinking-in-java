package chapter15.generics;

import java.lang.reflect.*;
import java.util.*;

public class Apply {
}

class Shape {
    public void rotate() {
        System.out.println(this + " rotate"); }
    public void resize(int newSize) {
        System.out.println(this + " resize " + newSize);
    }
}

class Square extends Shape {}
