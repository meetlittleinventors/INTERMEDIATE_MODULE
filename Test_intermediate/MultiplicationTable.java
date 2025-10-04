import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MultiplicationTable extends Application {
    public void start(Stage stage) {
        TextField numberField = new TextField();
        numberField.setPromptText("Enter a number");

        Button generateBtn = new Button("Generate Table");
        TextArea tableArea = new TextArea();
        tableArea.setEditable(false);

        generateBtn.setOnAction(e -> {
            try {
                int num = Integer.parseInt(numberField.getText().trim());
                StringBuilder table = new StringBuilder();
                for (int i = 1; i <= 10; i++) {
                    table.append(num).append(" x ").append(i)
                         .append(" = ").append(num * i).append("\n");
                }
                tableArea.setText(table.toString());
            } catch (NumberFormatException ex) {
                tableArea.setText("Invalid input! Please enter a number.");
            }
        });

        VBox vbox = new VBox(10, numberField, generateBtn, tableArea);
        vbox.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(vbox, 300, 350);
        stage.setTitle("Multiplication Table Generator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
