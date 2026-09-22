
public class ll_q6 {
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
		//del at pos 4
		int pos=4;
		Node current = head;
		for(int i =1;i<pos-1;i++) {
	    	current=current.next;
		}
		current.next=current.next.next;
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}

	}

}
