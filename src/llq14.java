public class llq14 {
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
		Node fourth=new Node(35);
		//connect the nodes 
		head.next =second;
		second.next=third;
	    third.next=fourth;
	    //insertion from end 
	    Node newNode=new Node(10);
	    	Node current =head;
	    	while(current.next!=null) {
	    		current=current.next;
	    	}
	    	current.next=newNode;
	    	Node temp = head;
	    	while(temp!=null) {
	    		System.out.print(temp.data+" ");
	    		temp=temp.next;
	    	}
	    }

	}


