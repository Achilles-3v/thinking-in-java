package chapter12.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Использование метода filter() stream()
 * @version 1.66 2024-01-13
 * @author Achilles
 */
public class StreamFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Oleg", 'm', 22, 4, 8.2);
        Student st2 = new Student("Kirill", 'm', 34, 3, 6.4);
        Student st3 = new Student("Dmitrii", 'm', 51, 5, 7.8);
        Student st4 = new Student("Mariya", 'f', 27, 2, 8.8);
        Student st5 = new Student("Ivan", 'm', 32, 3, 8.4);
        Student st6 = new Student("Svetlana", 'f', 24, 1, 7.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        students = students.stream().filter(element->
                element.getAge()>25 && element.getAvgGrade()<8)
                .collect(Collectors.toList());

        System.out.println(students);
    }
}
