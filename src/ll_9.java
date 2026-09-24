import ll_q5.Node;

public class ll_9 {
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
	    // two pointer approach 
	    Node onestep=head;
	    Node twostep=head;
	    while(twostep!=null && twostep.next!=null) {
	    	onestep=onestep.next;
	    	twostep=twostep.next.next;
	    }
	    System.out.println("middle:"+ onestep.data);
	    

	}

}
