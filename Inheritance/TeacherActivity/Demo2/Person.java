class Person {
    void speak() { System.out.println("Person can speak"); }
}
class Employee extends Person {
    void work() { System.out.println("Employee is working"); }
}
class Manager extends Employee {
    void manage() { System.out.println("Manager is managing team"); }
}

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.speak();
        m.work();
        m.manage();
    }
}
