package chapter11.task27.holding;

import java.util.*;

/**
 * Бинарный поиск в ссылочных типах данных
 * @version 1.27 2024-01-06
 * @author Achilles
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Petr", 8542);
        Employee emp4 = new Employee(15, "Mariya", 5678);
        Employee emp5 = new Employee(182, "Kolya", 9500);
        Employee emp6 = new Employee(15, "Sasha", 3200);
        Employee emp7 = new Employee(250, "Elena", 7900);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);

        System.out.println(employees);

        Collections.sort(employees);
        System.out.println(employees);

        int index = Collections.binarySearch(employees, new Employee(182, "Kolya", 9000));
        System.out.println(index);
    }
}
