package chapter10.task23.controller;

/**
 * Общие для всякого управляющего события методы
 * @version 1.23 2023-12-28
 * @author Bruce Eckel
 */

public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        // С возможностю перезапуска
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
