import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class IntermediateQuizGame extends Application {
    int current = 0;
    int score = 0;

    String[] questions = {"5 + 3?", "7 - 2?", "2 * 4?"};
    String[][] options = {{"7","8"}, {"5","4"}, {"6","8"}};
    int[] answers = {1,1,1}; // index of correct option

    Label qLabel;
    Button opt1, opt2;
    Label feedback;

    public void start(Stage stage) {
        qLabel = new Label(questions[current]);
        opt1 = new Button(options[current][0]);
        opt2 = new Button(options[current][1]);
        feedback = new Label("Score: " + score);

        opt1.setOnAction(e -> checkAnswer(0));
        opt2.setOnAction(e -> checkAnswer(1));

        VBox vbox = new VBox(10, qLabel, opt1, opt2, feedback);
        vbox.setStyle("-fx-padding: 20px;");
        Scene scene = new Scene(vbox, 300, 200);
        stage.setTitle("Intermediate Quiz Game");
        stage.setScene(scene);
        stage.show();
    }

    private void checkAnswer(int selected) {
        if(selected == answers[current]) score++;
        current++;
        if(current < questions.length) {
            qLabel.setText(questions[current]);
            opt1.setText(options[current][0]);
            opt2.setText(options[current][1]);
            feedback.setText("Score: " + score);
        } else {
            feedback.setText("Quiz Over! Final Score: " + score);
            opt1.setDisable(true);
            opt2.setDisable(true);
        }
    }

    public static void main(String[] args) { launch(args); }
}
