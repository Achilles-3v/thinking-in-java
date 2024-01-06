package chapter11.task27.holding;

/**
 * Бинарный поиск в ссылочных типах данных
 * @version 1.27 2024-01-06
 * @author Achilles
 */

public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
