package javadsa;

import java.util.Arrays;

public class bubblesortq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {40,50,10,2,3,500};
		for(int i =0;i<arr.length;i++){
			for(int j=1;j<arr.length-i ;j++) {
				//swap if the item is smaller than the previous item
				if(arr[j]<arr[j-1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					 
					
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
