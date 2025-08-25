import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Easy1_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null, tail = null;

        for(int i=0; i<3; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            Node newNode = new Node(num);

            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Print linked list
        System.out.print("Linked List: ");
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        sc.close();
    }
}
