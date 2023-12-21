package chapter08.task18.rtti;

/**
 * Низходящее преобразование и динамическое определение типов (RTTI)
 * {ThrowException}
 * @version 1.18 2023-12-22
 * @author Bruce Eckel
 */

class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}

public class RTTI {

    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };

        x[0].f();
        x[1].g();
        // Стадия компиляции: метод не найден в классе Useful
        //! x[1].u();
        ((MoreUseful)x[1]).u();     // Низходящее преобразование / RTTI
        //! ((MoreUseful)x[0]).u();     // Exception
    }
}
