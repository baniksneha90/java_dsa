import java.util.Scanner;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word:");
		char ch = sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("vowel");
		}else {
			System.out.println("consonents");
		}
		

	}

}
