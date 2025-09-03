import java.util.LinkedList;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        LinkedList<String> taskQueue = new LinkedList<>();
        
        // Enqueue (add to the end) tasks
        taskQueue.addLast("Task 1: Process invoice");
        taskQueue.addLast("Task 2: Send email");
        taskQueue.addLast("Task 3: Update database");
        
        System.out.println("Initial queue: " + taskQueue);
        
        // Dequeue (remove from the front) and process tasks
        String nextTask = taskQueue.removeFirst();
        System.out.println("Processing: " + nextTask);
        System.out.println("Queue after processing one task: " + taskQueue);
        
        nextTask = taskQueue.removeFirst();
        System.out.println("Processing: " + nextTask);
        System.out.println("Queue after processing a second task: " + taskQueue);

        nextTask = taskQueue.removeFirst();
        System.out.println("Processing: " + nextTask);
        System.out.println("Queue is empty: " + taskQueue);
    }
}
