package chapter10.task26.innerclass;

/**
 * Внутренний класс нельзя переопределить
 * подобно обычному методу
 * @version 1.26 2023-12-30
 * @author Bruce Eckel
 */

class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }
    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}

public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
