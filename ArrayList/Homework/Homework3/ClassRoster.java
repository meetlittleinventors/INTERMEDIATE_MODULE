import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoster {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Search Student\n4. Display Students\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    students.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    students.remove(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String name = sc.nextLine();
                    if (students.contains(name)) {
                        System.out.println(name + " is in the class.");
                    } else {
                        System.out.println(name + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Class Roster: " + students);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}
