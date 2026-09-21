package practice_java;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double length= sc.nextDouble();
		double width= sc.nextDouble();
		double area= length*width;
		double p = 2*(length + width);
		System.out.println("area:"+area);
		System.out.println("perimeter:"+p);
		
		sc.close();

	}

}
