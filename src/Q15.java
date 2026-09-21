import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int yr= sc.nextInt();
		if((yr%400==0)||(yr%4==0 && yr%100!=0)) {
			System.out.println("leap yr");
		}else {
			System.out.println("not a leap year");
		}
		

	}

}
