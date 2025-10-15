import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.*;
import java.util.*;

public class FileQuizGame extends Application {

    private Label questionLabel, feedbackLabel;
    private Button option1Button, option2Button;
    private List<Question> questions = new ArrayList<>();
    private int currentIndex = 0;
    private int score = 0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Quiz Game with File-Based Questions");

        questionLabel = new Label("Loading questions...");
        feedbackLabel = new Label("");

        option1Button = new Button();
        option2Button = new Button();

        option1Button.setOnAction(e -> checkAnswer(option1Button.getText()));
        option2Button.setOnAction(e -> checkAnswer(option2Button.getText()));

        VBox layout = new VBox(15, questionLabel, option1Button, option2Button, feedbackLabel);
        layout.setStyle("-fx-padding: 20; -fx-font-size: 16;");

        Scene scene = new Scene(layout, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        loadQuestionsFromFile();
        showNextQuestion();
    }

    private void loadQuestionsFromFile() {
        File file = new File("questions.txt");
        if (!file.exists()) {
            showAlert("Error loading questions! File not found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    questions.add(new Question(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        } catch (IOException e) {
            showAlert("Error reading question file!");
        }
    }

    private void showNextQuestion() {
        if (currentIndex < questions.size()) {
            Question q = questions.get(currentIndex);
            questionLabel.setText(q.getText());
            option1Button.setText(q.getOption1());
            option2Button.setText(q.getOption2());
            feedbackLabel.setText("");
        } else {
            questionLabel.setText("Quiz Over! Final Score: " + score + " / " + questions.size());
            option1Button.setVisible(false);
            option2Button.setVisible(false);
            feedbackLabel.setText("");
        }
    }

    private void checkAnswer(String selected) {
        Question q = questions.get(currentIndex);
        if (selected.equalsIgnoreCase(q.getCorrectAnswer())) {
            feedbackLabel.setText("✅ Correct! Score: " + (++score));
        } else {
            feedbackLabel.setText("❌ Wrong! Score: " + score);
        }
        currentIndex++;
        showNextQuestion();
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

    static class Question {
        private final String text, option1, option2, correctAnswer;

        public Question(String text, String option1, String option2, String correctAnswer) {
            this.text = text;
            this.option1 = option1;
            this.option2 = option2;
            this.correctAnswer = correctAnswer;
        }

        public String getText() { return text; }
        public String getOption1() { return option1; }
        public String getOption2() { return option2; }
        public String getCorrectAnswer() { return correctAnswer; }
    }
}
