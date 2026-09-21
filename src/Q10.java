import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value of a:");
		int a = sc.nextInt();
		System.out.println("enter the value of b:");
		int b = sc. nextInt();
		a= a+b;
		b=a-b;
		a= a-b;
		System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


	}

}
