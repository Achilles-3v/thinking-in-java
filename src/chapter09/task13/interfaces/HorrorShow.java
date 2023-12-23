package chapter09.task13.interfaces;

/**
 * Расширение интерфейса с помощью наследования
 * @version 1.13 2023-12-23
 * @author Bruce Eckel
 */

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void menace() {
    }

    @Override
    public void destroy() {
    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VaryBadVampire implements Vampire {
    public void menace() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

public class HorrorShow {

    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }

    public static void main(String[] args) {

        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VaryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
