package chapter10.task08.innerclass;

/**
 * Вложение класса в область действия
 * @version 1.8 2023-12-26
 * @author Bruce Eckel
 */

public class Parcel6 {

    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() { return id; }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }

    public void track() { internalTracking(true);}

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
