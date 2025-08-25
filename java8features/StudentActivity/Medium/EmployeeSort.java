import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Amit", 50000),
            new Employee("Neha", 70000),
            new Employee("Rahul", 45000),
            new Employee("Priya", 60000)
        );

        employees.stream()
                 .sorted(Comparator.comparingInt(e -> e.salary))
                 .forEach(e -> System.out.println(e.name + " - " + e.salary));
    }
}
