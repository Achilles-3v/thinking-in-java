package chapter07.task12.hide;

/**
 * Перегрузка имени метода из базового класса
 * в производном классе не скроет
 * базовую версию метода
 * @version 1.11 2023-12-19
 * @author Bruce Eckel
 */

class Homer {

    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhous)");
    }
}

class Lisa extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhous)");
    }
}

public class Hide {

    public static void main(String[] args) {

        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
        Lisa lisa = new Lisa();
        lisa.doh(new Milhouse());
        lisa.doh(5);
    }
}
