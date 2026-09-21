package javadsa;
import java.util.Scanner;
public class arr_obj {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [] str=new String[6];
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		for(int i =0;i<str.length;i++) {
			System.out.print(str[i]);
		}

	}

}
