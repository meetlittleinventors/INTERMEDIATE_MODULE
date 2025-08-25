import java.util.ArrayList;

public class RemoveLowScores {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(90);
        scores.add(75);
        scores.add(60);
        scores.add(95);

        // Remove scores below 80
        scores.removeIf(score -> score < 80);

        System.out.println("Updated Scores: " + scores);
    }
}
