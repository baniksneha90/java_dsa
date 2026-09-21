import java.util.Scanner;
public class Q45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int smallest=9;
		while(num!=0) {
			int dig=num%10;
			if(dig<smallest) {
				smallest=dig;
			}
			num/=10;
		}
		System.out.println(smallest);

	}

}
