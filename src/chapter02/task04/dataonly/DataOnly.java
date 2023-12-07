package chapter02.task04.dataonly;

public class DataOnly {

    int i = 47;
    double d = 1.1d;
    boolean b = true;

    public static void main(String[] args) {
        DataOnly data = new DataOnly();

        data.i = 73;
        data.b = false;

        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}
