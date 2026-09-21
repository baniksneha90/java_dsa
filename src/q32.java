import java.util.Scanner;
public class q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev=0;
		while(num!=0) {  //% = keeps the last dig , / removes the last dig 
			int dig=num%10;
			rev = rev*10+dig;
			num=num/10;
		}
		System.out.println(rev);

	}

}
