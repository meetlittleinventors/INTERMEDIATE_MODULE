class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void show() {
        System.out.println(name + " scored " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 88);
        Student s2 = new Student("Riya", 95);

        s1.show();
        s2.show();
    }
}
