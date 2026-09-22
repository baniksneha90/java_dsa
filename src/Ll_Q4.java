import L_LQ3.Node;

public class Ll_Q4 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		Node second=new Node(20);
		Node third = new Node(30);
	    Node fourth = new Node(40);
	    Node fifth =new Node(50);
	    //connect 
	    head.next=second;
	    second.next=third;
	    third.next=fourth;
	    fourth.next=fifth;
	    // insert before a specific position 
	    int target=30;
	    Node newNode=new Node(25);
	    Node current=head;
	    while(current.next!=null && current.next.data!=target) {
	    	current=current.next;
	    }
	    if(current.next!=null) {
	    	newNode.next=current.next;
	    	current.next=newNode;
	    }
	    Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
	    

	}

}
}
