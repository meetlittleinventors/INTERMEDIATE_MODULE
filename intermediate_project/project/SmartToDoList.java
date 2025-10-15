import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.*;
import java.util.*;

public class SmartToDoList extends Application {

    private ListView<String> taskListView;
    private TextField taskField;
    private final String FILE_NAME = "tasks.txt";
    private final List<String> tasks = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Smart To-Do List");

        // UI Elements
        taskField = new TextField();
        taskField.setPromptText("Enter a task");

        Button addButton = new Button("Add Task");
        Button deleteButton = new Button("Delete Task");

        taskListView = new ListView<>();

        // Load tasks from file at startup
        loadTasksFromFile();

        // Add Task Action
        addButton.setOnAction(e -> addTask());

        // Delete Task Action
        deleteButton.setOnAction(e -> deleteTask());

        // Layout
        HBox inputBox = new HBox(10, taskField, addButton, deleteButton);
        VBox layout = new VBox(10, inputBox, taskListView);
        layout.setStyle("-fx-padding: 20; -fx-font-size: 14;");

        primaryStage.setScene(new Scene(layout, 400, 400));
        primaryStage.show();
    }

    private void addTask() {
        String task = taskField.getText().trim();
        if (task.isEmpty()) {
            showAlert("Please enter a valid task!");
            return;
        }

        tasks.add(task);
        taskListView.getItems().add(task);
        saveTasksToFile();
        taskField.clear();
    }

    private void deleteTask() {
        String selectedTask = taskListView.getSelectionModel().getSelectedItem();
        if (selectedTask == null) {
            showAlert("Please select a task to delete!");
            return;
        }

        tasks.remove(selectedTask);
        taskListView.getItems().remove(selectedTask);
        saveTasksToFile();
    }

    private void loadTasksFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                showAlert("Error creating task file!");
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                tasks.add(line);
            }
            taskListView.getItems().addAll(tasks);
        } catch (IOException e) {
            showAlert("Error loading tasks!");
        }
    }

    private void saveTasksToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String t : tasks) {
                bw.write(t);
                bw.newLine();
            }
        } catch (IOException e) {
            showAlert("Error saving tasks!");
        }
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
