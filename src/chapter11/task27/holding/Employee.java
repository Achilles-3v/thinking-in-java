package chapter11.task27.holding;

/**
 * Бинарный поиск в ссылочных типах данных
 * @version 1.27 2024-01-06
 * @author Achilles
 */

public class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0)
            result = this.name.compareTo(anotherEmp.name);
        return result;
    }
}
