import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class IntermediateTodoList extends Application {
    public void start(Stage stage) {
        TextField taskField = new TextField();
        Button addBtn = new Button("Add Task");
        Button delBtn = new Button("Delete Task");
        ListView<String> list = new ListView<>();

        addBtn.setOnAction(e -> {
            if(!taskField.getText().isEmpty()) {
                list.getItems().add(taskField.getText());
                taskField.clear();
            }
        });

        delBtn.setOnAction(e -> {
            String selected = list.getSelectionModel().getSelectedItem();
            if(selected != null) list.getItems().remove(selected);
        });

        VBox vbox = new VBox(10, taskField, addBtn, delBtn, list);
        Scene scene = new Scene(vbox, 300, 250);
        stage.setTitle("Intermediate To-Do List");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
