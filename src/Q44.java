import java.util.Scanner;
public class Q44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int largest=0;
		while(n!=0) {
			int dig=n%10;
			if(dig>largest) {
				largest=dig;
				n/=10;
			}
			System.out.println(largest);
		}

	}

}
