class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Q5_SearchNode {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(30);
        Node fourth = new Node(40);
        first.next = second;
        second.next = third;
        third.next = fourth;

        int target = 30;
        Node current = first;
        boolean found = false;
        while(current != null){
            if(current.data == target){
                found = true;
                break;
            }
            current = current.next;
        }

        System.out.print("Searching for 30: ");
        System.out.println(found ? "Found" : "Not Found");
    }
}
