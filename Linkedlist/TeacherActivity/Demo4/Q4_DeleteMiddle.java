class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Q4_DeleteMiddle {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(20);
        Node fourth = new Node(30);
        Node fifth = new Node(40);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Delete node with value 20
        Node prev = first;
        Node current = first.next;
        while(current != null){
            if(current.data == 20){
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }

        current = first;
        System.out.print("After deleting 20: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
