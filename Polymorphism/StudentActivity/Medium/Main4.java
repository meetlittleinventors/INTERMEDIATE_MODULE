class Employee {
    void calculateBonus() { System.out.println("Standard bonus"); }
}
class Manager extends Employee {
    void calculateBonus() { System.out.println("Manager bonus: 20%"); }
}
class Developer extends Employee {
    void calculateBonus() { System.out.println("Developer bonus: 10%"); }
}

public class Main4 {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        e1.calculateBonus();
        e2.calculateBonus();
    }
}
