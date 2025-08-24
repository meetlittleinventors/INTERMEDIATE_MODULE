class Student {
    String name;
    int marks;

    void setDetails(String n, int m) {
        name = n;
        marks = m;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    void isPassed() {
        if (marks >= 40) {
            System.out.println(name + " has Passed");
        } else {
            System.out.println(name + " has Failed");
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setDetails("Amit", 85);
        s2.setDetails("Neha", 35);
        s3.setDetails("Ravi", 60);

        s1.showDetails(); s1.isPassed();
        s2.showDetails(); s2.isPassed();
        s3.showDetails(); s3.isPassed();
    }
}
