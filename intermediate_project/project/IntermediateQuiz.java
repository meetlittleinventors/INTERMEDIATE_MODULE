import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class IntermediateQuiz extends Application {
    int score = 0;

    public void start(Stage stage) {
        Label question = new Label("What is 5 + 3?");
        Button opt1 = new Button("7");
        Button opt2 = new Button("8");
        Label feedback = new Label("Score: 0");

        opt1.setOnAction(e -> feedback.setText("Wrong! Score: " + score));
        opt2.setOnAction(e -> feedback.setText("Correct! Score: " + (++score)));

        VBox vbox = new VBox(10, question, opt1, opt2, feedback);
        Scene scene = new Scene(vbox, 300, 200);
        stage.setTitle("Intermediate Quiz Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
