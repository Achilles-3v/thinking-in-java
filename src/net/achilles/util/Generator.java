package net.achilles.util;

/**
 * Обобщенный интерфейс
 * @version 13 2024-02-10
 * @author Bruce Eckel
 */
public interface Generator<T> {
    T next();
}
