import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToDoList extends Application {
    @Override
    public void start(Stage stage) {
        ObservableList<String> tasks = FXCollections.observableArrayList();
        ListView<String> listView = new ListView<>(tasks);
        TextField input = new TextField();
        input.setPromptText("Enter a task");
        Button add = new Button("Add Task");
        Button delete = new Button("Delete Task");

        add.setOnAction(e -> {
            if (!input.getText().isEmpty()) {
                tasks.add(input.getText());
                input.clear();
            }
        });

        delete.setOnAction(e -> {
            String selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null)
                tasks.remove(selected);
        });

        VBox root = new VBox(10, input, add, delete, listView);
        stage.setScene(new Scene(root, 300, 300));
        stage.setTitle("To-Do List");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
