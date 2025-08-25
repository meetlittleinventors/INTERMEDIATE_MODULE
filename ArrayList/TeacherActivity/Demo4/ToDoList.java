import java.util.ArrayList;
import java.util.Collections;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Do Homework");
        tasks.add("Clean Room");
        tasks.add("Read Book");

        System.out.println("Tasks: " + tasks);

        // Mark a task as done (remove it)
        tasks.remove("Clean Room");
        System.out.println("After Removing: " + tasks);

        // Add new task
        tasks.add("Go Shopping");
        System.out.println("Updated Tasks: " + tasks);

        // Reorder (swap 0 and 1)
        Collections.swap(tasks, 0, 1);
        System.out.println("After Reordering: " + tasks);
    }
}
