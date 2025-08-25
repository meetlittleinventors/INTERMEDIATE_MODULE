class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Q2_InsertBeginning {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        first.next = second;
        second.next = third;

        // Insert 5 at beginning
        Node newHead = new Node(5);
        newHead.next = first;
        first = newHead;

        Node current = first;
        System.out.print("After inserting 5 at beginning: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
