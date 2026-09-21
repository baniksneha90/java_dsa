package javadsa;

public class fact_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=fact(5);
		System.out.println(ans);
		

	}
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
		
	}

}
