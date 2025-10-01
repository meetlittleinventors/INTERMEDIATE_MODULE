// Multilevel Inheritance Example
class Person {
    void displayPerson() {
        System.out.println("I am a Person.");
    }
}

class Employee extends Person {
    void displayEmployee() {
        System.out.println("I am an Employee.");
    }
}

class Manager extends Employee {
    void displayManager() {
        System.out.println("I am a Manager.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}
