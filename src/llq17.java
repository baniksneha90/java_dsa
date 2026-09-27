public class llq17 {
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
		Node fourth=new Node(40);
		
		//connect the nodes 
		head.next =second;
		second.next=third;
		third.next=fourth;
		// searching 
		int target = 40;
		int pos = 1;
		Node current = head;
		while(current !=null) {
			if(current.data == target) {
				System.out.println("found at position :"+pos);
				break;
				
			}
			current=current.next;
			pos++;
			Node temp = head;
			while(temp!=null) {
				System.out.println( temp.data +" ");
				temp=temp.next;
			}
				
			}
		}
	   

}
