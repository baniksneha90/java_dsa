package javadsa;

public class count_rec {

	public static void main(String[] args) {
		System.out.println(count(56789));

	}
	static int count(int n) {
		if(n==0) {
			return 0;
		}
		return 1+ count(n/10);
	}

}
