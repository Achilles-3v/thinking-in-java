package chapter10.task23.controller;

import java.util.*;

/**
 * Вместе с классом Event составляет систему
 * управления общего характера
 * @version 1.23 2023-12-28
 * @author Bruce Eckel
 */

public class Controller {
    // Класс из пакета java.util для хранения объектов Event
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        while (eventList.size() > 0) {
            // Создать копию, чтобы избежать модификации
            // списка во время выборки элементов
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
