class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void showDetails() {
        System.out.println(name + " scored " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 85);
        Student s2 = new Student("Neha", 92);

        s1.showDetails();
        s2.showDetails();
    }
}
