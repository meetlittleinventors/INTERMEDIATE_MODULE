import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.*;
import java.util.*;

public class TemperatureTracker extends Application {

    private TextField inputField;
    private ListView<String> historyList;
    private ComboBox<String> unitSelector;
    private final String FILE_NAME = "history.txt";
    private final List<String> history = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Temperature Tracker with History");

        inputField = new TextField();
        inputField.setPromptText("Enter temperature in Celsius");

        unitSelector = new ComboBox<>();
        unitSelector.getItems().addAll("Fahrenheit", "Kelvin");
        unitSelector.setValue("Fahrenheit");

        Button convertButton = new Button("Convert");
        Button clearButton = new Button("Clear History");

        historyList = new ListView<>();
        loadHistory();

        convertButton.setOnAction(e -> convertTemperature());
        clearButton.setOnAction(e -> clearHistory());

        VBox layout = new VBox(10, inputField, unitSelector, convertButton, clearButton, historyList);
        layout.setStyle("-fx-padding: 20; -fx-font-size: 14;");

        primaryStage.setScene(new Scene(layout, 400, 450));
        primaryStage.show();
    }

    private void convertTemperature() {
        try {
            double celsius = Double.parseDouble(inputField.getText().trim());
            String selectedUnit = unitSelector.getValue();
            double result;

            if (selectedUnit.equals("Fahrenheit")) {
                result = (celsius * 9 / 5) + 32;
            } else {
                result = celsius + 273.15;
            }

            String record = String.format("%.2f°C = %.2f%s", celsius, result, 
                            selectedUnit.equals("Fahrenheit") ? "°F" : "K");

            history.add(record);
            historyList.getItems().add(record);
            saveHistory();
            inputField.clear();

        } catch (NumberFormatException e) {
            showAlert("Invalid input! Please enter a number.");
        }
    }

    private void clearHistory() {
        history.clear();
        historyList.getItems().clear();
        saveHistory();  // overwrite empty
    }

    private void loadHistory() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try { file.createNewFile(); } catch (IOException ignored) {}
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                history.add(line);
            }
            historyList.getItems().addAll(history);
        } catch (IOException ignored) {}
    }

    private void saveHistory() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String record : history) {
                bw.write(record);
                bw.newLine();
            }
        } catch (IOException ignored) {}
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
