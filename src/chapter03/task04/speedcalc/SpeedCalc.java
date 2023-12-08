package chapter03.task04.speedcalc;

public class SpeedCalc {

    double distance;
    int timeMinutes;

    public static void main(String[] args) {
        SpeedCalc sc = new SpeedCalc();
        sc.distance = 0.7;
        sc.timeMinutes = 5;

        System.out.println(calculate(sc.distance, sc.timeMinutes) + " km/h");
    }

    public static double calculate(double pDistance, int time) {
        return pDistance / (time / 60.0);
    }
}
