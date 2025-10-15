import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SmartTableGenerator extends Application {

    @Override
    public void start(Stage stage) {
        Label title = new Label("📘 Smart Multiplication Table Generator");
        Label numberLabel = new Label("Enter a number:");
        TextField numberField = new TextField();
        numberField.setPromptText("e.g., 7");

        Label rangeLabel = new Label("Select table range:");
        ComboBox<Integer> rangeBox = new ComboBox<>();
        rangeBox.getItems().addAll(10, 15, 20);
        rangeBox.setValue(10);

        Button generateBtn = new Button("Generate Table");
        Button clearBtn = new Button("Clear");
        TextArea output = new TextArea();
        output.setEditable(false);

        generateBtn.setOnAction(e -> {
            try {
                int num = Integer.parseInt(numberField.getText());
                int limit = rangeBox.getValue();
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= limit; i++) {
                    sb.append(num + " x " + i + " = " + (num * i) + "\n");
                }
                output.setText(sb.toString());
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Invalid Input");
                alert.setContentText("Please enter a valid number!");
                alert.showAndWait();
            }
        });

        clearBtn.setOnAction(e -> {
            numberField.clear();
            output.clear();
        });

        HBox inputRow = new HBox(10, numberLabel, numberField);
        HBox rangeRow = new HBox(10, rangeLabel, rangeBox);
        HBox buttonRow = new HBox(10, generateBtn, clearBtn);

        VBox root = new VBox(15, title, inputRow, rangeRow, buttonRow, output);
        root.setStyle("-fx-padding: 15; -fx-background-color: #F9F9F9; -fx-font-size: 14;");
        Scene scene = new Scene(root, 400, 400);

        stage.setTitle("Smart Table Generator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
