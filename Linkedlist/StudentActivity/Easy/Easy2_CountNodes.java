class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Easy2_CountNodes {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        first.next = second;
        second.next = third;

        // Count nodes
        int count = 0;
        Node current = first;
        while(current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Total nodes: " + count);
    }
}
