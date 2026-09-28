public class llq18 {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(20);
        Node second = new Node(25);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // connect
        head.next = second;
        second.next = third;
        third.next = fourth;

        // count occurrence
        int count = 0;
        int target = 20;

        Node current = head;

        while (current != null) {

            if (current.data == target) {
                count++;
            }

            current = current.next;
        }

        System.out.println("Count = " + count);

        // print list
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}