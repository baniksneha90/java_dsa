import ll10.Node;

public class llq11 {
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

	//del a node
	    int target=30;
	    Node current = head;
	    while(current !=null && current.next!=null) {
	    	if(current.next.data==target) {
	    		current.next=current.next.next;
	    		break;
	    	}
	    	current=current.next;
	    }
	    	Node temp = head;

	    	while (temp != null) {
	    	    System.out.print(temp.data + " ");
	    	    temp = temp.next;
	    	}
	    		
	    	}
	    }
	    

	


