
public class L_LISTQ2 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		//create nodes 
		Node head=new Node(10);
		Node second=new Node(20);
		Node third = new Node(30);
	    Node fourth = new Node(40);
	    //connect nodes
	     head.next=second;
	     second.next=third;
	     third.next=fourth;
	     //length
	     int count=0;
	     Node current=head;
	     while(current!=null) {
	    	 count++;
	    	 current=current.next;
	    	 
	     }
	     System.out.println("length="+count);

	}

}
