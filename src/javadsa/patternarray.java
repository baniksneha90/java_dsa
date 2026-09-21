package javadsa;
import java.util.Scanner;
public class patternarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr=new int[3][3];
		for(int r=0;r<3;r++){
			for(int c=0;c<arr[r].length;c++) {
				arr[r][c]=sc.nextInt()
;			}
		}
		//o/p
		for(int r=0; r<3;r++) {
			for(int c= 0;c<arr[r].length;c++) {
				System.out.print(arr[r][c]+ " ");
			}
			System.out.println();
		}
				

	}

}
