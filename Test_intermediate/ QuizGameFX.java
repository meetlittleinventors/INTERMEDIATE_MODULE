import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.*;
import java.util.*;

public class QuizGameFX extends Application {

    private List<String[]> questions = new ArrayList<>();
    private int index = 0, score = 0;
    private Label qLabel = new Label();
    private Label feedback = new Label();

    @Override
    public void start(Stage stage) {
        loadQuestions();

        Button opt1 = new Button();
        Button opt2 = new Button();

        opt1.setOnAction(e -> checkAnswer(opt1.getText()));
        opt2.setOnAction(e -> checkAnswer(opt2.getText()));

        VBox root = new VBox(10, qLabel, opt1, opt2, feedback);
        root.setStyle("-fx-padding:20; -fx-alignment:center;");

        showQuestion(opt1, opt2);

        stage.setScene(new Scene(root, 400, 250));
        stage.setTitle("Quiz Game");
        stage.show();
    }

    private void loadQuestions() {
        try (BufferedReader br = new BufferedReader(new FileReader("quiz.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length == 4) questions.add(p);
            }
        } catch (IOException e) {
            feedback.setText("Error loading quiz file!");
        }
    }

    private void showQuestion(Button opt1, Button opt2) {
        if (index < questions.size()) {
            String[] q = questions.get(index);
            qLabel.setText("Q" + (index + 1) + ". " + q[0]);
            opt1.setText(q[1]);
            opt2.setText(q[2]);
            feedback.setText("");
        } else {
            qLabel.setText("Quiz Over! Final Score: " + score);
            opt1.setVisible(false);
            opt2.setVisible(false);
        }
    }

    private void checkAnswer(String selected) {
        String correct = questions.get(index)[3];
        if (selected.equalsIgnoreCase(correct)) {
            score++;
            feedback.setText("Correct! Score: " + score);
        } else {
            feedback.setText("Wrong! Score: " + score);
        }
        index++;
        Button b1 = (Button) ((VBox) qLabel.getParent()).getChildren().get(1);
        Button b2 = (Button) ((VBox) qLabel.getParent()).getChildren().get(2);
        showQuestion(b1, b2);
    }

    public static void main(String[] args) {
        launch();
    }
}
