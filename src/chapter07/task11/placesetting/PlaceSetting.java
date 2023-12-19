package chapter07.task11.placesetting;

/**
 * Совмещение композиции и наследования
 * @version 1.11 2023-12-19
 * @author Bruce Eckel
 */

class Plate {
    Plate(int i) {
        System.out.println("Constructor Plate");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("Constructor DinnerPlate");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Constructor Utensil");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Constructor Spoon");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Constructor Fork");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Constructor Knife");
    }
}

class Custom {
    Custom(int i) {
        System.out.println("Constructor Custom");
    }
}

public class PlaceSetting extends Custom{

    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("Constructor PlaceSetting");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
