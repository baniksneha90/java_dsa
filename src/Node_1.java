
public class Node_1 {
	static class Node{
	int data; 
	Node next ; 
	Node(int data){
		this.data=data;
		this.next=null;
	}
	}
	public static void main(String[] args) {
		// create nodes 
		 Node head = new Node(10);
	     Node second = new Node(20);
	     Node third = new Node(30);
	     // connect the nodes 
	     head.next=second;
	     second.next = third ; 
	  // insertion at beginning
    	 Node newNode = new Node (5);
    	 newNode .next=head;
    	 head=newNode;
    	 // insertion at end 
    	 Node newNode2=new Node(40);
    	 Node current2=head;
    	 while(current2.next!=null) {
    		 current2=current2.next;
    	 }
    	 current2.next=newNode2;
    	 //insertion a specific position 
    	 Node newNode3=new Node(25);
    	 Node current3=head;
    	 while(current3.data!=20) {
    		 current3=current3.next;
    	 }
    	 newNode3.next=current3.next;
    	 current3.next=newNode3;
    	 //del 5
    	 head=head.next;
    	 //del 40 
    	 Node current = head;
    	 while(current.next.next!=null) {
    		 current=current.next;
    	 }
    	 current.next=null;
    	 // del a specific node 
    	 int value=25;
    	 current=head;
    	 while(current.next!=null && current.next.data!=value) {
    		 current=current.next;
    		 }
    	 if(current.next!=null) {
    		 current.next=current.next.next;
    	 }
    	 //search for a value 
    	 int target = 30;
    	  current = head;
    	  while(current!=null) {
    		  if(current.data==target) {
    			  System.out.println("found");
    			  break;
    		  }
    		  current=current.next;
    	  }
    	  //lengtgh of ll
    	  int count =0;
    	  current = head;
    	  while(current!=null) {
    		  count++;
    		  current=current.next;  
    	  }
    	  System.out.println("length= "+ count);
    	  // full rev code 
    	  Node prev = null ; 
    	 
	     //print the list 
	     Node temp=head;
	     while(temp !=null) {
	    	 System.out.print(temp.data + " ");
	    	 temp = temp.next;
	     }
		

	}

}
