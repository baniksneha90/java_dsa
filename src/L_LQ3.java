import L_LISTQ2.Node;

public class L_LQ3 {
	static class Node{
		int data ;
		Node next;
		Node(int data){
			this.data = data;
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
	    int target=40;
	    //length
	    int count=0;
	    Node current=head;
	    while(current!=null) {
	    	count++;
	    	current=current.next;
	    	
	    }
	    System.out.print("length:"+count);
	    //search
	    current = head;
	    while(current!=null) {
	    	if(current.data==target) {
	    		System.out.print("FOUND!!");
	    		break;
	    	}
	    		current=current.next;
	    		
	    	}
	    	}
	    
	    

	}


