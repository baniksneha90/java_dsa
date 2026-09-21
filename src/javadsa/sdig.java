 package javadsa;

public class sdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1234));
	}
	static int sum(int n) {
		if (n==0) {
			return 0;
		}
		return(n%10)+ sum(n/10);
	}

}
