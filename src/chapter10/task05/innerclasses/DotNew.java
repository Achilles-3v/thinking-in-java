package chapter10.task05.innerclasses;

/**
 * Прямое создание объекта внутреннего
 * класса с синтаксисом .new.
 * @version 1.5 2023-12-25
 * @author Bruce Eckel
 */

public class DotNew {

    public class Inner {

        public static void main(String[] args) {
            DotNew dn = new DotNew();
            DotNew.Inner dni = dn.new Inner();
        }
    }
}
