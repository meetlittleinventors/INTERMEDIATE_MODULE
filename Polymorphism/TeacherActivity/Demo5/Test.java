class Employee {
    void calculateSalary() {
        System.out.println("Employee salary is calculated");
    }
}

class Intern extends Employee {
    void calculateSalary() {
        System.out.println("Intern Salary = 10000");
    }
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager Salary = 50000");
    }
}

class CEO extends Employee {
    void calculateSalary() {
        System.out.println("CEO Salary = 100000");
    }
}

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Intern();
        Employee e2 = new Manager();
        Employee e3 = new CEO();
        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}
