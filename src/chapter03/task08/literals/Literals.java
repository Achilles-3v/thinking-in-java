package chapter03.task08.literals;

public class Literals {

    public static void main(String[] args) {
        long i16 = 0x32425L;
        long i8 = 032425;
        System.out.println(Long.toBinaryString(i16));
        System.out.println(Long.toBinaryString(i8));
    }
}
