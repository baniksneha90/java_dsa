package javadsa;

import java.util.Arrays;

public class linsearch {

	public static void main(String[] args) {
		int[]arr= {5,2,8,1,9};
		int temp=arr[0];
		arr[0]=arr[4];
		arr[4]=temp;
		System.out.print(Arrays.toString(arr));
	}
}
