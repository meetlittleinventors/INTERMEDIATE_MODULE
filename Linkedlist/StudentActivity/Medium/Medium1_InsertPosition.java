class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Medium1_InsertPosition {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        first.next = second;
        second.next = third;

        // Insert 20 at position 2 (after first)
        Node newNode = new Node(20);
        Node current = first;
        int position = 2;
        for(int i=1; i<position-1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        // Print updated list
        current = first;
        System.out.print("After insertion: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
