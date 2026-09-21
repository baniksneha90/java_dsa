package javadsa;

public class largest_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,5,8,2,9,1};
		System.out.println(max(arr,0));

	}
	static int max(int[]arr, int index) {
		if(index==arr.length-1) {
			return(arr[index]);
			
		}
		int maxofrest=max(arr,index+1);
		return Math.max(arr[index], maxofrest);
	}

}
