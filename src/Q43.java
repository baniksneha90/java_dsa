import java.util.Scanner;
public class Q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int even=0;
		int odd=0;
		while(n!=0) {
			int dig=n%10;
			if(dig%2==0) {
				even++;
			}else {
				odd++;
				n=n/10;
			}
			System.out.println("Even Digits = " + even);
	        System.out.println("Odd Digits = " + odd);

		}
		

		

	}

}
