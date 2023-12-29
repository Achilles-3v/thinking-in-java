package chapter10.task25.innerclass;

/**
 * Наследование от внутреннего класса
 * @version 1.25 2023-12-29
 * @author Bruce Eckel
 */

class WithInner {
    class Inner {}
}

public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {

        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
