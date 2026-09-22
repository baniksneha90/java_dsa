import Ll_Q4.Node;

public class ll_q5 {
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
	    ///del by position 
	    int position=3;
	    Node current = head;
	    for(int i =1;i<position-1;i++) {
	    	current=current.next;
	    }
	    current.next=current.next.next;
	    Node temp=head;
	    while(temp!=null) {
	    	System.out.println(temp.data+" ");
	    	temp =temp.next;
	    }

	}

}
