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


}
