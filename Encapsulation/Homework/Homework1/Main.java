class Student {
    private String name;
    private int rollNumber;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Neha");
        s.setRollNumber(101);
        System.out.println("Name: " + s.getName() + ", Roll Number: " + s.getRollNumber());
    }
}
