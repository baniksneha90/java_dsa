import java.util.Scanner;
public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int count=0;
		int n=sc.nextInt();
		while(n!=0) {
		count++;
		n/=10;

	}
		System.out.println("digits:"+count);

}
}
