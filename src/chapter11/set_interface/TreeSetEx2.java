package chapter11.set_interface;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Ivan", 4);
        Student st2 = new Student("Petr",3);
        Student st3 = new Student("Sidor", 5);
        Student st4 = new Student("Denis", 1);
        Student st5 = new Student("Kostya",  2);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);

        Student st6 = new Student("Oleg", 2);
        Student st7 = new Student("Vasilii", 4);

        System.out.println(treeSet.subSet(st6, st7));
        System.out.println(st6.equals(st5));
    }
}
