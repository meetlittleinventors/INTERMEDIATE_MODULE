import java.io.*;
import java.util.*;

public class ClassMarksSummary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        PrintWriter pw = new PrintWriter(new FileWriter("summary.txt"));

        String line;
        int maxTotal = -1;
        String topper = "";

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int total = 0;

            for (int i = 1; i < parts.length; i++) {
                total += Integer.parseInt(parts[i]);
            }

            double avg = (double) total / (parts.length - 1);
            pw.println(name + " → Total: " + total + ", Average: " + avg);

            if (total > maxTotal) {
                maxTotal = total;
                topper = name;
            }
        }
        pw.println("Topper: " + topper + " with total " + maxTotal);

        br.close();
        pw.close();
    }
}
