import java.util.Scanner;
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int unit=sc.nextInt();
		double bill;
		if(unit<=100) {
			bill=unit*1.5;
		}else if(unit<=200) {
			bill=(100*1.5)+(unit-100)*2.5;
		}else {
			bill=(100*1.5)+(100*2.5)+(unit-200)*4;
		}
		System.out.println(bill);

	}

}
