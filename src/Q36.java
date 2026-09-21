import java.util.Scanner;
public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int original =num;
		int sum =0;
		while(num!=0) {
			int dig=num%10;
			sum+=dig*dig*dig;
			num/=10;
		}
		 if (sum == original)
	            System.out.println("Armstrong Number");
	        else
	            System.out.println("Not Armstrong");

	}

}
