class Student {
    String name;
    int marks;

    Student(String n) {
        name = n;
        marks = 0;  // default
    }

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
        Student s1 = new Student("Amit");
        Student s2 = new Student("Riya", 92);

        s1.show();
        s2.show();
    }
}
