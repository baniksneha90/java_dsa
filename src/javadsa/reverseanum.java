package javadsa;

import java.util.Scanner;

public class reverseanum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev =0;
		while(n>0) {
			int rem =n%10;//remainder
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);

	}

}
