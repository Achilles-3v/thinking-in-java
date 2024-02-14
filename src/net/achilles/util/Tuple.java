package net.achilles.util;

import net.achilles.util.*;

/**
 * Библиотека кортежей с использованием
 * автоматического опредиления аргументов-типов
 * @version 16 2024-02-14
 * @author Bruce Eckel
 */
public class Tuple {
    public static <A,B> TwoTuple<A,B> tuple(A a, B b) {
        return new TwoTuple<A,B>(a, b);
    }
    public static <A,B,C> ThreeTuple<A,B,C>
    tuple(A a, B b, C c) {
        return new ThreeTuple<A,B,C>(a, b, c);
    }
}
