import llq11.Node;

public class llq12 {
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
	    /// remove head
	    if(head!=null) {
	    	head=head.next;
	    	
	    }
	    Node temp = head;
	    while(temp!=null) {
	    	System.out.println("data:"+temp.data);
	    		temp=temp.next;
	    	}
	    }


}
