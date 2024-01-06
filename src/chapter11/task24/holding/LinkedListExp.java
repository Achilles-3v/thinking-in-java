package chapter11.task24.holding;

import java.util.LinkedList;

public class LinkedListExp {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nikolay", 2);
        Student st3 = new Student("Elena", 1);
        Student st4 = new Student("Petr", 4);
        Student st5 = new Student("Mariya", 3);

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));

        Student st6 = new Student("Zaur", 3);
        Student st7 = new Student("Igor", 4);

        linkedList.add(st6);
        System.out.println(linkedList);

        linkedList.add(1, st7);
        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList);
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
