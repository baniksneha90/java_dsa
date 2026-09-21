public class basic_Linkedlist_Q1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Search
        int target = 10;

        Node current = head;

        while (current != null) {

            if (current.data == target) {
                System.out.println("Found");
                break;
            }

            current = current.next;
        }
    }
}