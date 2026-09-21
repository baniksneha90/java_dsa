package javadsa;

public class trianglepattern5 {

	public static void main(String[] args) {
		pattern(5);
	}
		// TODO Auto-generated method stub
		static void pattern(int n ) {
			for(int row=1;row<=n;row++ ) {
				for(int col=1;col<=row;col++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			for(int row=n-1;row>=1;row-- ) {
				for(int col=1;col<=row;col++) {
					System.out.print("* ");
				}
				System.out.println();
			
			
		}

	

}
}
