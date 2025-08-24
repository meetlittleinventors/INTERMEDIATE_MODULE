class Employee {
    String name;
    double salary;

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void showLanguage() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Amit";
        m.salary = 80000;
        m.department = "HR";
        m.display();
        m.showDepartment();

        Developer d = new Developer();
        d.name = "Neha";
        d.salary = 70000;
        d.programmingLanguage = "Java";
        d.display();
        d.showLanguage();
    }
}
