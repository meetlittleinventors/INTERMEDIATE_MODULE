class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    // Copy Constructor
    Student(Student s) {
        name = s.name;
        marks = s.marks;
    }

    void show() {
        System.out.println(name + " scored " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 85);
        Student s2 = new Student(s1); // copy constructor

        s1.show();
        s2.show();
    }
}
