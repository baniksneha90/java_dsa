
public class llq13 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}

	public static void main(String[] args) {
		Node head=new Node(20);
		Node second=new Node(25);
		Node third=new Node(30);
		Node fourth=new Node(35);
		//connect the nodes 
		head.next =second;
		second.next=third;
	    third.next=fourth;
	    //insert at beginning 
	    Node newNode=new Node(10);
	    newNode.next=head;
	    head=newNode;
	    Node temp=head;
	    while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
	}
	
	}
	

}
