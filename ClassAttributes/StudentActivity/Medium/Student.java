class Student {
    String name;
    int marks;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.marks = 85;

        System.out.println("Before update: " + s1.name + " scored " + s1.marks);

        // update marks
        s1.marks = 90;

        System.out.println("After update: " + s1.name + " scored " + s1.marks);
    }
}
