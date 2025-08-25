import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class MiniProject_LinkedList {
    static Node head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add at Position\n2. Delete by Value\n3. Reverse List\n4. Search\n5. Display\n6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    insertAtPosition(val, pos);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int del = sc.nextInt();
                    deleteByValue(del);
                    break;
                case 3:
                    reverseList();
                    System.out.println("List reversed.");
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    int searchVal = sc.nextInt();
                    searchNode(searchVal);
                    break;
                case 5:
                    displayList();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 6);

        sc.close();
    }

    static void insertAtPosition(int val, int pos) {
        Node newNode = new Node(val);
        if(pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for(int i=1; i<pos-1 && current != null; i++) {
            current = current.next;
        }
        if(current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Position out of bounds!");
        }
    }

    static void deleteByValue(int val) {
        if(head == null) return;
        if(head.data == val) {
            head = head.next;
            return;
        }
        Node prev = head;
        Node current = head.next;
        while(current != null) {
            if(current.data == val) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
        System.out.println("Value not found!");
    }

    static void reverseList() {
        Node prev = null, current = head, nextNode;
        while(current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    static void searchNode(int val) {
        Node current = head;
        while(current != null) {
            if(current.data == val) {
                System.out.println(val + " Found");
                return;
            }
            current = current.next;
        }
        System.out.println(val + " Not Found");
    }

    static void displayList() {
        Node current = head;
        if(current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Linked List: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
