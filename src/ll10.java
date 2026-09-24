import ll_9.Node;

public class ll10 {
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
	    // two pointer approach
	    int n =2;
	    int count =0;
	    Node current = head;
	    //length 
	    while(current!=null) {
	    	count++;
	    	current=current.next;
	    }
	    int pos=count-n+1;
	    current = head;
	    for(int i =1;i<pos;i++) {
	    	current=current.next;
	    }
	    System.out.println("ans:"+current.data);
	    }
	    
	    
	}

