//basic structure
public class sq1 {
	static int[] stack=new int[5];
	static int top=-1;
	//push
	static void push(int value) {
		if(top== stack.length-1) {
			System.out.println("stack overflow");
			return;
		}
		stack[++top]=value;
	}
	//pop  
	static int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
	}
	//peak
	static int peek() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -1;
		}
		return stack[top];
	}
	// display
	static void display() {
		for(int i = top;i>=0;i--) {
			System.out.println(stack[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		push(10);
        push(20);
        push(30);

        display();

        System.out.println("Peek: " + peek());

        System.out.println("Removed: " + pop());

        display();

	}

}
