import java.util.Scanner;
public class Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int original = num;
		int rev=0;
		
		 while(num!=0) {
			 int dig=num%10;
			 rev=rev*10+dig;
			 num/=10;
		 }
		 if(original==rev) {
			 System.out.println("palindrome");
		 }else {
			 System.out.println("not palindrome");
		 }

	}

}
