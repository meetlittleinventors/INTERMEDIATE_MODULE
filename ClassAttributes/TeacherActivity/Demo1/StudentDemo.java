class Student {
    String name;
    int marks;
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Neha";
        s2.marks = 92;

        System.out.println(s1.name + " scored " + s1.marks);
        System.out.println(s2.name + " scored " + s2.marks);

        // Update marks
        s1.marks = 90;
        System.out.println(s1.name + " new marks: " + s1.marks);
    }
}
