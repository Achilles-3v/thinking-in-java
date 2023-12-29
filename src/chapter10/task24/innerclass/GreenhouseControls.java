package chapter10.task24.innerclass;

import chapter10.task23.controller.Controller;
import chapter10.task23.controller.Event;

/**
 * Пример конкретного приложения на основе системы
 * управления, все находится в одном классе. Внутренние
 * классы дают возможность инкапсулировать различную
 * функциональность для каждого отдельного события
 * @version 1.24 2023-12-28
 * @author Bruce Eckel
 */

public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime);}
        @Override
        public void action() {
            // код управления оборудованием, включение света
            light = true;
        }
        public String toString() { return "Свет включен"; }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            light = false;
        }
        public String toString() { return "Свет выключен"; }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            water = true;
        }
        public String toString() { return "Полив включен"; }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) { super(delayTime);}

        @Override
        public void action() {
            water = false;
        }
        public String toString() { return "Полив выключен"; }
    }

    private String thermostat = "День";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            thermostat = "Ночь";
        }
        public String toString() { return "Термостат использует ночьной режим"; }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) { super(delayTime);}

        @Override
        public void action() {
            thermostat = "День";
        }
        public String toString() { return "Термостат использует дневной режим"; }
    }

    // Пример метода action(), вставляющего новый экземпляр
    // самого себя в список событий
    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Бам"; }
    }

    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start(); // Перезапуск каждого события
                addEvent(e);
            }
            start(); // Перезапуск текущего события
            addEvent(this);
        }

        public String toString() { return "Перезапуск системы"; }
    }


}
