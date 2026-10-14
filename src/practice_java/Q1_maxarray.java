package placement;
import java.util.Scanner;
public class Q1_maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr= {2,4,5,6};
		int max = arr[0];
		for (int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.print(max);
		
		
		

	}

}
