class Student {
    String name;
    int marks;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Amit";
        s1.marks = 85;

        s2.name = "Riya";
        s2.marks = 92;

        System.out.println(s1.name + " scored " + s1.marks);
        System.out.println(s2.name + " scored " + s2.marks);
    }
}
