import java.util.Scanner;
public class Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int b=sc.nextInt();
		int e = sc.nextInt();
		int result=1;
		for(int i =1;i<=e;i++) {
			result=result*b;
		}
		System.out.println(result);

	}

}
