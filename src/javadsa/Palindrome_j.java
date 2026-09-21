package javadsa;

public class Palindrome_j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1111;
		int reverse=rev(n,0);
		if(n==reverse)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}
	static int rev(int n,int reverse) {
		if (n==0) 
			return reverse;
		reverse=reverse*10+(n%10);
		return rev(n/10,reverse);
		}
	}


