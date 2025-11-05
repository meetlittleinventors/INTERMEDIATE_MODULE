import java.io.*;
import java.util.*;

public class SmartToDoList {
    static final String FILE = "tasks.txt";
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        loadTasks();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- Smart To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Mark as Done");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> addTask(sc);
                    case 2 -> viewTasks();
                    case 3 -> deleteTask(sc);
                    case 4 -> markDone(sc);
                    case 5 -> saveTasks();
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Please enter a number!");
            }
        }
    }

    static void loadTasks() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) tasks.add(line);
        } catch (IOException e) {
            System.out.println("(No previous tasks found)");
        }
    }

    static void saveTasks() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
            for (String t : tasks) bw.write(t + "\n");
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
        tasks.add(task + "|Pending");
        System.out.println("Task added successfully!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
            return;
        }
        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++)
            System.out.println((i + 1) + ". " + tasks.get(i));
    }

    static void deleteTask(Scanner sc) {
        viewTasks();
        if (tasks.isEmpty()) return;
        System.out.print("Enter task number to delete: ");
        int num = Integer.parseInt(sc.nextLine());
        if (num < 1 || num > tasks.size()) {
            System.out.println("Invalid task number!");
            return;
        }
        tasks.remove(num - 1);
        System.out.println("Task deleted successfully!");
    }

    static void markDone(Scanner sc) {
        viewTasks();
        if (tasks.isEmpty()) return;
        System.out.print("Enter task number to mark as done: ");
        int num = Integer.parseInt(sc.nextLine());
        if (num < 1 || num > tasks.size()) {
            System.out.println("Invalid task number!");
            return;
        }
        String task = tasks.get(num - 1);
        if (task.contains("|Done")) {
            System.out.println("Task already marked as done!");
        } else {
            task = task.replace("|Pending", "|Done");
            tasks.set(num - 1, task);
            System.out.println("Task marked as done!");
        }
    }
}
