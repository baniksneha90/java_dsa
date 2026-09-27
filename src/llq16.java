

public class llq16 {
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
		Node head=new Node(20);
		Node second=new Node(25);
		Node third=new Node(30);
		
		//connect the nodes 
		head.next =second;
		second.next=third;
	   
	    // dlt at specific position
		int pos=2;
	    Node current=head;
	  for(int i =1;i<pos-1;i++) {
		  current=current.next;
		  }

  	current.next=current.next.next;
  	
	    Node temp=head;  
	    while(temp!=null) {
	    	System.out.print(temp.data +" ");
	    	temp=temp.next;
	    }
	    

	}

}



	