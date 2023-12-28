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
}
