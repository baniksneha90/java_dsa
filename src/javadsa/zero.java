package javadsa;

public class zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(500900));

	}
	static int count(int n) {
		if (n==0) {
			return 0;
		}
		if (n%10==0) {
			return 1 + count(n/10);
		}
		return count(n/10);
	}

}
