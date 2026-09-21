
public class Q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {//row
			for(int j=1;j<=5-i;j++) {//spaces
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++) {//col
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
