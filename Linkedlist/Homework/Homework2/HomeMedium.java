class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class HomeMedium {
    public static void main(String[] args) {
        // Original list: 5 -> 10 -> 15 -> 20 -> 25
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Insert 12 at 3rd position
        Node newNode = new Node(12);
        Node current = first;
        for(int i=1; i<3-1; i++) {
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
