import java.util.ArrayList;
import java.util.Collections;

public class TopScores {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(88);
        scores.add(92);
        scores.add(75);
        scores.add(95);

        System.out.println("Scores: " + scores);

        // Update score at index 2
        scores.set(2, 80);
        System.out.println("After Updating: " + scores);

        // Sort scores
        Collections.sort(scores);
        System.out.println("Sorted Scores: " + scores);

        // Highest score
        int highest = Collections.max(scores);
        System.out.println("Highest Score: " + highest);
    }
}
