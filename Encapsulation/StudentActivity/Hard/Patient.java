class Patient {
    private String name;
    private int age;
    private String disease;

    public void setPatient(String name, int age, String disease) {
        if (age > 0) {
            this.name = name;
            this.age = age;
            this.disease = disease;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void showRecord() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }
}

public class Test5 {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.setPatient("Rahul", 35, "Flu");
        p.showRecord();

        p.setPatient("Amit", -5, "Cough"); // invalid
    }
}
