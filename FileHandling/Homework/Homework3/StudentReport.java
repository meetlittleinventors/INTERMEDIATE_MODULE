import java.io.*;

public class StudentReport {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        PrintWriter pw = new PrintWriter(new FileWriter("report.txt"));

        String line = br.readLine(); // skip header
        String topper = "";
        int maxTotal = -1;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int m1 = Integer.parseInt(parts[1]);
            int m2 = Integer.parseInt(parts[2]);
            int m3 = Integer.parseInt(parts[3]);

            int total = m1 + m2 + m3;
            double avg = total / 3.0;

            pw.println(name + " → Total: " + total + ", Average: " + avg);

            if (total > maxTotal) {
                maxTotal = total;
                topper = name;
            }
        }

        pw.println("\nTopper: " + topper + " with total " + maxTotal);
        br.close();
        pw.close();

        System.out.println("Report generated in report.txt");
    }
}
