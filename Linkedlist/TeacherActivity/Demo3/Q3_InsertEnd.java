class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Q3_InsertEnd {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(20);
        Node fourth = new Node(30);
        first.next = second;
        second.next = third;
        third.next = fourth;

        // Insert 40 at end
        Node newNode = new Node(40);
        Node current = first;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

        current = first;
        System.out.print("After inserting 40 at end: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
