package javadsa;
import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean found=false;
		while(n>0) {
			int dig=n%10;
			if(dig%2==0) {
				found=true;
				break;
			}
			n=n/10;
		}
		if(found) {
			System.out.println("even");
			
		}else {
			System.out.println("odd");
		}
		

	}

}
