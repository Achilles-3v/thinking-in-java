package net.achilles.util;

import java.util.LinkedList;

/**
 * Создание стека на основе LinkedList
 * @version 11.01 2024-01-01
 * @author Bruce Eckel
 * @param <T>
 */

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v) { storage.addFirst(v); }
    public T peek() { return storage.getFirst(); }
    public T pop() { return storage.removeFirst(); }
    public boolean empty() { return storage.isEmpty(); }
    public String toString() { return storage.toString(); }
}
