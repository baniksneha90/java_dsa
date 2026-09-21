package javadsa;

public class min {

	public static void main(String[] args) {
		int[]arr= {1,2,3,78};
		int min= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				arr[i]=min;
			}
		}
		System.out.println(min);

	}

}
