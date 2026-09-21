package javadsa;

import java.util.Arrays;

public class Swapping {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		int temp=arr[1];
		arr[1]=arr[4];
		arr[4]=temp;
		System.out.println(Arrays.toString(arr));

}
}
