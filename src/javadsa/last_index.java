package javadsa;

public class last_index {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 2, 5, 2};
		System.out.println(last(arr,2,arr.length-1));

	}
	static int last(int[]arr, int target,int index) {
		if( index<0) {
			return -1;
		}
		if (arr[index]==target) {
			return index ;
		}
		return last(arr,target,index-1);
	}

}
