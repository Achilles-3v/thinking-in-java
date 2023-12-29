package chapter10.task24.innerclass;

import chapter10.task23.controller.*;

/**
 * Насторйка и запуск системы управления
 * @version 1.24 2023-12-29
 * @author Bruce Eckel
 */

public class GreenhouseController {

    public static void main(String[] args) {

        GreenhouseControls gc = new GreenhouseControls();
        // Вместо жесткой фиксации параметров в коде
        // можно было бы считать информацию
        // из текстового файла
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };

        gc.addEvent(gc.new Restart(200, eventList));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        gc.run();
    }
}
