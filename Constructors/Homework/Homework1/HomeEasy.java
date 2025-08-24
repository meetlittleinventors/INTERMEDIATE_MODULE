class Greeter {
    void greetMorning(String name) {
        System.out.println("Good Morning, " + name + "!");
    }

    void greetEvening(String name) {
        System.out.println("Good Evening, " + name + "!");
    }
}

public class HomeEasy {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        Greeter g2 = new Greeter();

        g1.greetMorning("Amit"); // Output: Good Morning, Amit!
        g1.greetEvening("Amit"); // Output: Good Evening, Amit!
        g2.greetMorning("Neha"); // Output: Good Morning, Neha!
        g2.greetEvening("Neha"); // Output: Good Evening, Neha!
    }
}
