import java.io.*;
import java.util.*;

public class StudentMarksSystem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("students.csv", true));

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        int total = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
            pw.print((i == 1 ? name : "") + "," + marks + (i == 3 ? "\n" : ""));
        }
        pw.close();

        // Read and Display Data
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String line;
        int maxTotal = -1;
        String topper = "";

        System.out.println("\n--- Student Report ---");
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String studentName = parts[0];
            int t = 0;
            for (int i = 1; i < parts.length; i++) {
                t += Integer.parseInt(parts[i]);
            }
            double avg = (double) t / (parts.length - 1);
            System.out.println(studentName + " → Total: " + t + ", Avg: " + avg);

            if (t > maxTotal) {
                maxTotal = t;
                topper = studentName;
            }
        }
        br.close();

        System.out.println("\nTopper: " + topper + " with " + maxTotal + " marks.");
    }
}
