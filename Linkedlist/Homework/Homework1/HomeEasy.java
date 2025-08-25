class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class HomeEasy {
    public static void main(String[] args) {
        // Creating linked list: 5 -> 10 -> 15 -> 20 -> 25
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Print linked list
        Node current = first;
        System.out.print("Linked List: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
