package chapter14.typeinfo.task02;

/**
 * Загрузчик классов
 * @version 14.02 2024-01-28
 * @author Bruce Eckel
 */

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
}
