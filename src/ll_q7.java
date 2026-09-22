import ll_q6.Node;

public class ll_q7 {
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
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);
		Node sixth=new Node(60);
		//connect 
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		int position=3;
		int newvalue=35;
		Node current=head;
		for(int i =1;i<position;i++) {
			current=current.next;
		}
		current.data=newvalue;
		Node temp = head;

		while (temp != null) {
		    System.out.print(temp.data + " ");
		    temp = temp.next;
		}
		

	}

}
