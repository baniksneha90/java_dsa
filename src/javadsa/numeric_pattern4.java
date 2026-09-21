package javadsa;

public class numeric_pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(4);

	}
	static void pattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();

}
	}
}
		
