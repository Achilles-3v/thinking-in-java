package chapter03.task02.naming;

public class Name {

    double damage = 2.2;

    public static void main(String[] args) {

        Name n1 = new Name();
        Name n2 = new Name();
        n1.damage = 5.2;
        n2.damage = 3.7;

        System.out.println("n1: " + n1.damage + ", n2: " + n2.damage);
        // n1 = n2;
        n1.damage = n2.damage;
        System.out.println("n1: " + n1.damage + ", n2: " + n2.damage);
        n1.damage = 4.4;
        System.out.println("n1: " + n1.damage + ", n2: " + n2.damage);
    }
}
