import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ToDoListApp extends Application {
    public void start(Stage stage) {
        TextField taskField = new TextField();
        taskField.setPromptText("Enter a task");

        Button addBtn = new Button("Add Task");
        Button deleteBtn = new Button("Delete Task");

        ListView<String> taskList = new ListView<>();

        addBtn.setOnAction(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskList.getItems().add(task);
                taskField.clear();
            }
        });

        deleteBtn.setOnAction(e -> {
            String selected = taskList.getSelectionModel().getSelectedItem();
            if (selected != null) {
                taskList.getItems().remove(selected);
            }
        });

        HBox inputBox = new HBox(10, taskField, addBtn, deleteBtn);
        VBox vbox = new VBox(10, inputBox, taskList);
        vbox.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("To-Do List");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
