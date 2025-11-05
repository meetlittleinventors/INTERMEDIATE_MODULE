import java.io.*;
import java.util.*;

public class QuizGame {
    public static void main(String[] args) {
        String fileName = "quiz.txt";
        int score = 0;
        List<String[]> questions = new ArrayList<>();

        // Read questions from file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 4) questions.add(parts);
            }
        } catch (IOException e) {
            System.out.println("Error reading quiz file!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        for (String[] q : questions) {
            System.out.println("\nQuestion: " + q[0]);
            System.out.println("1. " + q[1]);
            System.out.println("2. " + q[2]);
            System.out.print("Enter your choice (1 or 2): ");
            String ans = sc.nextLine();

            if (ans.equals("1") && q[1].equalsIgnoreCase(q[3]) ||
                ans.equals("2") && q[2].equalsIgnoreCase(q[3])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! Correct answer: " + q[3]);
            }
        }

        System.out.println("\nQuiz Over! Final Score: " + score + "/" + questions.size());
    }
}
