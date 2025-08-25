class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Medium2_ReverseList {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        first.next = second;
        second.next = third;

        // Reverse linked list
        Node prev = null, current = first, nextNode;
        while(current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        Node head = prev;

        // Print reversed list
        System.out.print("Reversed List: ");
        current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
