import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class HomeHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create linked list: 5 -> 10 -> 15 -> 20 -> 25
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Search for a value
        System.out.print("Enter value to search: ");
        int searchVal = sc.nextInt();
        Node current = first;
        boolean found = false;
        while(current != null) {
            if(current.data == searchVal) {
                found = true;
                break;
            }
            current = current.next;
        }
        System.out.println(found ? searchVal + " Found" : searchVal + " Not Found");

        // Delete a value
        System.out.print("Enter value to delete: ");
        int delVal = sc.nextInt();

        if(first != null && first.data == delVal) {
            first = first.next;
        } else {
            Node prev = first;
            current = first.next;
            while(current != null) {
                if(current.data == delVal) {
                    prev.next = current.next;
                    break;
                }
                prev = current;
                current = current.next;
            }
        }

        // Print updated list
        System.out.print("Updated Linked List: ");
        current = first;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        sc.close();
    }
}
