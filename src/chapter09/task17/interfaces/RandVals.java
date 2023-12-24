package chapter09.task17.interfaces;

import java.util.*;

/**
 * Инициализация полей интерфейсов
 * не-константными выражениями
 * @version 1.17 2023-12-24
 * @author Bruce Eckel
 */

public interface RandVals {
    Random RANDOM = new Random(47);
    int RANDOM_INT = RANDOM.nextInt(10);
    long RANDOM_LONG = RANDOM.nextLong() * 10;
    float RANDOM_FLOAT = RANDOM.nextLong() * 10;
    double RANDOM_DOUBLE = RANDOM.nextDouble() * 10;
}
