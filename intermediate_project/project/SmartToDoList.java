import java.io.*;
import java.util.*;

public class SmartToDoList {
    static final String FILE_NAME = "tasks.txt";
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        loadTasks();

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- Smart To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> addTask(sc);
                    case 2 -> viewTasks();
                    case 3 -> deleteTask(sc);
                    case 4 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    static void loadTasks() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) tasks.add(line);
        } catch (FileNotFoundException e) {
            System.out.println("(No existing task file found, will create one later)");
        } catch (IOException e) {
            System.out.println("Error loading tasks!");
        }
    }

    static void saveTasks() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) bw.write(task + "\n");
        } catch (IOException e) {
            System.out.println("Error saving tasks!");
        }
    }

    static void addTask(Scanner sc) {
        System.out.print("Enter new task: ");
        String task = sc.nextLine().trim();
        if (task.isEmpty()) {
            System.out.println("Please enter a valid task!");
            return;
        }
        tasks.add(task);
        saveTasks();
        System.out.println("Task added successfully!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to show.");
            return;
        }
        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++)
            System.out.println((i + 1) + ". " + tasks.get(i));
    }

    static void deleteTask(Scanner sc) {
        viewTasks();
        if (tasks.isEmpty()) return;
        try {
            System.out.print("Enter task number to delete: ");
            int num = Integer.parseInt(sc.nextLine());
            if (num < 1 || num > tasks.size()) {
                System.out.println("Invalid task number!");
                return;
            }
            tasks.remove(num - 1);
            saveTasks();
            System.out.println("Task deleted successfully!");
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
        }
    }
}
