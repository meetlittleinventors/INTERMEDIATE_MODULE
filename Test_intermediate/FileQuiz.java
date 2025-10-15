import java.io.*;
import java.util.*;

public class FileQuiz {
    public static void main(String[] args) {
        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("quiz.txt"))) {
            String line;
            Scanner sc = new Scanner(System.in);
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 4) {
                    System.out.println("\n" + parts[0]);
                    System.out.println("1. " + parts[1]);
                    System.out.println("2. " + parts[2]);
                    System.out.print("Enter your choice (1 or 2): ");
                    int ans = sc.nextInt();
                    if (parts[ans].equals(parts[3])) {
                        System.out.println("✅ Correct!");
                        score++;
                    } else {
                        System.out.println("❌ Wrong!");
                    }
                }
            }
            System.out.println("\nQuiz Over! Final Score: " + score);
        } catch (IOException e) {
            System.out.println("Error loading questions file.");
        }
    }
}
