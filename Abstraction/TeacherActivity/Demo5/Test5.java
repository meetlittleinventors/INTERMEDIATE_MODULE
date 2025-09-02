interface Bonus {
    void calculateBonus();
}

abstract class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    abstract void showDetails();
}

class Manager extends Employee implements Bonus {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void showDetails() {
        System.out.println("Manager Name: " + name + ", Salary: " + salary);
    }

    public void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.10));
    }
}

public class Test5 {
    public static void main(String[] args) {
        Manager m = new Manager("Amit", 50000);
        m.showDetails();
        m.calculateBonus();
    }
}
